package com.rafael.demo.controller;

import java.util.Arrays;
import java.util.List;

import com.rafael.demo.modelo.Curso;
import com.rafael.demo.modelo.Topico;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @RequestMapping("/")
    public String home(){
        return "hello world!";
    }

    @RequestMapping("/topicos")
    public List<Topico> topicos(){

        Topico topico = new Topico("Duvida Javascript", "Texto qualquer", new Curso("Curso de JS", "Web"));

        return Arrays.asList(topico, topico, topico);
    }

}