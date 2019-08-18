package com.rsm.megasena.domain;

public enum Numero {
    UM(1, "Um"),
    DOIS(2, "Dois"),
    TRES(3, "Tres"),
    QUATRO(4, "Quatro"),
    CINCO(5, "Cinco"),
    SEIS(6, "Seis"),
    SETE(7, "Sete"),
    OITO(8, "Oito"),
    NOVE(9, "Nove"),
    DEZ(10, "Dez"),
    ONZE(11, "Onze"),
    DOZE(12, "Doze"),
    TREZE(13, "Treze"),
    QUATORZE(14, "Quatorze"),
    QUINZE(15, "Quinze"),
    DEZESSEIS(16, "Dezesseis"),
    DEZESSETE(17, "Dezessete"),
    DEZOITO(18, "Dezoito"),
    DEZENOVE(19, "Dezenove"),
    VINTE(20, "Vinte"),
    VINTEEUM(21, "Vinte e Um"),
    VINTEEDOIS(22, "Vinte e Dois"),
    VINTEETRES(23, "Vinte e Tres"),
    VINTEEQUATRO(24, "Vinte e Quatro"),
    VINTEECINCO(25, "Vinte e Cinco"),
    VINTEESEIS(26, "Vinte e Seis"),
    VINTEESETE(27, "Vinte e Sete"),
    VINTEEOITO(28, "Vinte e Oito"),
    VINTEENOVE(29, "Vinte e Nove"),
    TRINTA(30, "Trinta"),
    TRINTAEUM(31, "Trinta e Um"),
    TRINTAEDOIS(32, "Trinta e Dois"),
    TRINTAETRES(33, "Trinta e Tres"),
    TRINTAEQUATRO(34, "Trinta e Quatro"),
    TRINTAECINCO(35, "Trinta e Cinco"),
    TRINTAESEIS(36, "Trinta e Seis"),
    TRINTAESETE(37, "Trinta e Sete"),
    TRINTAEOITO(38, "Trinta e Oito"),
    TRINTAENOVE(39, "Trinta e Nove"),
    QUARENTA(40, "Quarenta"),
    QUARENTAEUM(41, "Quarenta e Um"),
    QUARENTAEDOIS(42, "Quarenta e Dois"),
    QUARENTAETRES(43, "Quarenta e Tres"),
    QUARENTAEQUATRO(44, "Quarenta e Quatro"),
    QUARENTAECINCO(45, "Quarenta e Cinco"),
    QUARENTAESEIS(46, "Quarenta e Seis"),
    QUARENTAESETE(47, "Quarenta e Sete"),
    QUARENTAEOITO(48, "Quarenta e Oito"),
    QUARENTAENOVE(49, "Quarenta e Nove"),
    CINQUENTA(50, "Cinquenta"),
    CINQUENTAEUM(51, "Cinquenta e Um"),
    CINQUENTAEDOIS(52, "Cinquenta e Dois"),
    CINQUENTAETRES(53, "Cinquenta e Tres"),
    CINQUENTAEQUATRO(54, "Cinquenta e Quatro"),
    CINQUENTAECINCO(55, "Cinquenta e Cinco"),
    CINQUENTAESEIS(56, "Cinquenta e Seis"),
    CINQUENTAESETE(57, "Cinquenta e Sete"),
    CINQUENTAEOITO(58, "Cinquenta e Oito"),
    CINQUENTAENOVE(59, "Cinquenta e Nove"),
    SESSENTA(60, "Sessenta");

    private int valor;
    private String nome;

    Numero(int valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
