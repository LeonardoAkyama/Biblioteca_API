package com.facens.biblioteca_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Teste {

    @GetMapping("/TesteBiblioteca")
    public String ola() {
        return "Biblioteca API funcionando!";
    }
}