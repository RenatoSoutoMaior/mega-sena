package com.rsm.megasena.controller;

import com.rsm.megasena.domain.Dado;
import com.rsm.megasena.domain.MegaSena;
import com.rsm.megasena.service.DadosService;
import com.rsm.megasena.service.JogosService;
import com.rsm.megasena.service.MegaSenaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MegaSenaController {

    @Autowired
    private MegaSenaService megaSenaService;

    @Autowired
    private JogosService jogosService;

    @Autowired
    private DadosService dadosService;

    @GetMapping("/sortear-numeros")
    public ResponseEntity<Object> sortearNumeros() {
        String numeros = megaSenaService.getNumeros();
        return new ResponseEntity<>(numeros, HttpStatus.OK);
    }

    @GetMapping("/jogos")
    public ResponseEntity<Object> getJogos() {
        List<MegaSena> megaSenas = jogosService.getJogos();
        return new ResponseEntity<>(megaSenas.toString(), HttpStatus.OK);
    }

    @GetMapping("/dados")
    public ResponseEntity<Object> getDados() {
        List<MegaSena> megaSenas = jogosService.getJogos();
        List<Dado> dados = dadosService.getDados(megaSenas);
        return new ResponseEntity<>(dados.toString(), HttpStatus.OK);
    }
}
