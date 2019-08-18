package com.rsm.megasena.controller;

import com.rsm.megasena.service.MegaSenaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MegaSenaController {

    private final MegaSenaService megaSenaService;

    public MegaSenaController(MegaSenaService megaSenaService) {
        this.megaSenaService = megaSenaService;
    }

    @GetMapping
    public ResponseEntity<Object> sortearNumeros() {
        String numeros = megaSenaService.getNumeros();
        return new ResponseEntity<>(numeros, HttpStatus.OK);
    }
}
