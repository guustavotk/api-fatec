package com.programacao.web.fatec.api_fatec.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    // Endpoint para testar a API de clientes
    @GetMapping("/teste1")
    public String testeCliente() {
        return "Teste Cliente1";
    }

    @GetMapping("/teste2{nome}")
    public String testeCliente2(@PathVariable String nome) {
        return nome;
    }
}