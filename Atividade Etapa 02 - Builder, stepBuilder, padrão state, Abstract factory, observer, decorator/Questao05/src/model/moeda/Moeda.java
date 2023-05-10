package org.example.quest5;

public abstract class Moeda {
    protected double valor;
    public Moeda(double valor) {
        this.valor = valor;
    }
    public abstract String getSimbolo();
    public abstract String getValorFormatado();
}
