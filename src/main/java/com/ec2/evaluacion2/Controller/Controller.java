package com.ec2.evaluacion2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String mostrarCodigoYNombre() {
        return "AT71814680 - Jesus Martin Gonzales Pocco";
    }
    @GetMapping("/idat/codigo")
    public String mostrarCodigoIdat() {
        return "AT71814680";
    }
    @GetMapping("/idat/nombre-completo")
    public String mostrarNombreCompleto() {
        return "Jesus Martin Gonzales Pocco";
    }
}
