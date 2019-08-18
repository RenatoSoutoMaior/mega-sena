package com.rsm.megasena.domain;

import java.util.List;

public class MegaSena {

    private List<Integer> numeros;

    public MegaSena(List<Integer> numeros) {
        this.numeros = numeros;
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }

    @Override
    public String toString() {
        return "Números sorteados: " + numeros;
    }
}
