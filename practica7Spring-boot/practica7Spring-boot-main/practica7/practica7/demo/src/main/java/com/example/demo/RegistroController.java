package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistroController {
    Registro registro;

    @GetMapping("/getRegister")
    public Registro getRegister(){
        return registro;
    }

    @PostMapping("/register")
    public void postRegister(@RequestBody Registro registro){
        this.registro=registro;
    }

    
}
