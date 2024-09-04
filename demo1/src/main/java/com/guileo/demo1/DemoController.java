package com.guileo.demo1;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.ArrayList;

@RestController
public class DemoController {
    private List<Livro> listaDeLivros;

    
    @GetMapping("/")
    @CrossOrigin(origins = "*")
    public String consultaCidadesAtendidas() {
        return "Bem Vindo a biblioteca central";
    }
}


