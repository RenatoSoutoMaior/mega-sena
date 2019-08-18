package com.rsm.megasena.service;

import com.rsm.megasena.controller.MegaSenaController;
import com.rsm.megasena.domain.MegaSena;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MegaSenaService {

    private final Logger LOG = LoggerFactory.getLogger(MegaSenaController.class);

    public String getNumeros() {
        return new MegaSena(sortearNumeros()).toString();
    }

    private List<Integer> sortearNumeros() {
        LOG.info("Sorteando números da Mega Sena.");
        Set<Integer> numerosNaoRepetidos = new HashSet<>();
        Random random = new Random();

        while (numerosNaoRepetidos.size() < 6) {
            Integer numeroSorteado = random.nextInt((60 - 1) + 1) + 1;
            LOG.info("Número sorteado: " + numeroSorteado);
            numerosNaoRepetidos.add(numeroSorteado);
        }

        List<Integer> numeros = new ArrayList<>(numerosNaoRepetidos);
        Collections.sort(numeros);

        LOG.info("Números sorteados: " + numeros);
        return numeros;
    }
}
