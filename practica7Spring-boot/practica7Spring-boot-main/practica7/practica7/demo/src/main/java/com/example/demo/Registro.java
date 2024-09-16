package com.example.demo;

public class Registro {
    String nombre;
    String apellido;
    String direccionCorreo;
    String contrasenya;
    String repContrasenya;

    public Registro(String nombre, String apellido, String direccionCorreo, String contrasenya, String repContrasenya)
    {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setDireccionCorreo(direccionCorreo);
        this.setContrasenya(contrasenya);
        this.setRepContrasenya(repContrasenya);
    }

    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getDireccionCorreo(){
        return direccionCorreo;
    }
    public String getContrasenya(){
        return contrasenya;
    }
    public String getRepContrasenya(){
        return repContrasenya;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public void setDireccionCorreo(String direccionCorreo){
        this.direccionCorreo=direccionCorreo;
    }
    public void setContrasenya(String contrasenya){
        this.contrasenya=contrasenya;
    }
    public void setRepContrasenya(String repContrasenya){
        this.repContrasenya=repContrasenya;
    }


    
}
