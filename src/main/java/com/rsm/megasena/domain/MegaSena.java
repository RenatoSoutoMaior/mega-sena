package com.rsm.megasena.domain;

import java.util.Collections;
import java.util.List;

public class MegaSena {

    private List<Integer> numeros;
    private String resultado;

    public MegaSena(List<Integer> numeros) {
        this.numeros = numeros;
        setResultado(numeros);
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }

    public String getResultado() {
        return resultado;
    }

    private void setResultado(List<Integer> numeros) {
        Collections.sort(numeros);
        String resultadoFormado = "";

        for (int i = 0; i <= 6; i++) {
            if (i == 6) {
                resultadoFormado = resultadoFormado.concat(numeros.get(i).toString());
            } else {
                resultadoFormado = resultadoFormado.concat(numeros.get(i).toString()).concat(" - ");
            }
        }

        this.resultado = resultadoFormado;
    }
}
