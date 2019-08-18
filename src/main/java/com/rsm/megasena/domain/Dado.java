package com.rsm.megasena.domain;

public class Dado {

    private Numero numero;
    private int quantidade;

    public Dado(Numero numero) {
        this.numero = numero;
    }

    public Numero getNumero() {
        return numero;
    }

    public void setNumero(Numero numero) {
        this.numero = numero;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void somaQuantidade() {
        this.quantidade = this.quantidade + 1;
    }

    @Override
    public String toString() {
        return "\n" + numero.getNome() + ": " + quantidade;
    }
}
