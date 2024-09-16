let ponerMensaje = (mensaje) => {
  console.log(mensaje);
};

let llamarApi = async (moneda) => {
  let peticion = await fetch("https://api.frankfurter.app/latest", {
    method: "GET",
  });
  if (peticion.status == 200) {
    let datos = await peticion.json();
    //console.log(datos)
    rates = datos.rates;
    //console.log(rates);
    if (moneda === "EUR") {
      valor = 1;
      return valor;
    }
    let contar = 0;
    for (rate in rates) {
      if (rate == moneda) {
        //console.log(moneda);
        valor = rates[moneda];
        //console.log(valor);
        valor = parseFloat(valor);
        contar = 1;
        return valor;
      } else {
        console.log("continua buscando");
        //document.getElementById('resultadoFinal').innerHTML="Una de las monedas introducidas no funciona";
        //window.alert("la moneda "+moneda+" no existe");
      }
    }
    if (contar == 0) {
      window.alert("la moneda " + moneda + " no existe");
    }
  }
};

let sacarValores = async (cantidad, monedaDe, monedaA) => {
  await llamarApi(monedaDe);
  valorDe = valor;
  console.log("valorDe: " + valorDe);

  await llamarApi(monedaA);
  valorA = valor;
  console.log("ValorA: " + valorA);

  res = calcularCantidad(cantidad, valorDe, valorA);
  console.log("Resultado: " + res);

  let texto = cantidad + " " + monedaDe + " equivale a " + res + " " + monedaA;
  document.getElementById("resultadoFinal").innerHTML = texto;
};

let calcularCantidad = (cantidad, valorDe, valorA) => {
  let resultado = (cantidad * valorA) / valorDe;
  resultado = resultado.toFixed(2);
  //console.log(resultado);
  return resultado;
};

let getInputs = () => {
  let cantidad = document.getElementById("validationCustom01").value;
  let monedaDe = document.getElementById("validationCustom02").value;
  let monedaA = document.getElementById("validationCustomUsername").value;
  let listaInputs = [];
  listaInputs[0] = cantidad;
  listaInputs[1] = monedaDe;
  listaInputs[2] = monedaA;
  return listaInputs;
};

let registrarButton = document.getElementById("botonRegistro");

registrarButton.addEventListener(
  "click",
  //sacarValores();
  (getDatosRegistro = async () => {
    let inputNombre = document.getElementById("exampleFirstName").value;
    let inputApellido = document.getElementById("exampleLastName").value;
    let inputEmail = document.getElementById("exampleInputEmail").value;
    let inputContrasenya = document.getElementById(
      "exampleInputPassword"
    ).value;
    let inputRepContrasenya = document.getElementById(
      "exampleRepeatPassword"
    ).value;

    if (inputContrasenya === inputRepContrasenya) {
      let request = await fetch("/register", {
        method: "POST",
        credentials: "same-origin",
        //mode:"no-cors",
        headers: {
          "Content-Type": "application/json",
        },

        body: JSON.stringify({
          nombre: inputNombre,
          apellido: inputApellido,
          direccionCorreo: inputEmail,
          contrasenya: inputContrasenya,
          repContrasenya: inputRepContrasenya,
        }),
        dataType: "json",
      });
      if (request.ok) {
       // console.log(await request.json());
        document.getElementById("correcto").innerHTML = "Todo ha ido bien";
      }
    } else {
      alert("Revisa las contrasenyas porque no coinciden");
    }
    return "";
    //  header("Access-Control-Allow-Headers: Origin, XRequest-With, Content-Type, Accept");
  })
);

let recordarBoton = document.getElementById("botonRecordar");

recordarBoton.addEventListener(
  "click",
  //sacarValores();
  (recordarDatosRegistro = async () => {
    let get = await fetch("/getRegister", {
      method: "GET",
      credentials: "same-origin",
      dataType: "json",
    });
    if (get.ok) {
      var datos = await get.json();
      console.log(datos);
      var nombreIn = datos.nombre;
      var apellidoIn = datos.apellido;
      var correoIn = datos.direccionCorreo;
      var contrasenyaIn = datos.contrasenya;

      document.getElementById("nombreIn").innerHTML = nombreIn;
      document.getElementById("apellidoIn").innerHTML = apellidoIn;
      document.getElementById("correoIn").innerHTML = correoIn;
      document.getElementById("contrasenyaIn").innerHTML = contrasenyaIn;
    }
  })
);
