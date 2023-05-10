package org.example.quest4;

import java.awt.desktop.QuitEvent;

class Sanduiche {
    private Pao pao;
    private Queijo queijo;
    private Salada salada;
    private Presento presento;

    public Sanduiche montaSanduiche(Pao pao, Queijo queijo, Presento presento, Salada salada) {
        this.pao = pao;
        this.queijo = queijo;
        this.salada = salada;
        this.presento = presento;
        return this;
    }

    public Pao getPao() {
        return pao;
    }

    public void setPao(Pao pao) {
        this.pao = pao;
    }

    public Queijo getQueijo() {
        return queijo;
    }

    public void setQueijo(Queijo queijo) {
        this.queijo = queijo;
    }

    public Salada getSalada() {
        return salada;
    }

    public void setSalada(Salada salada) {
        this.salada = salada;
    }

    public Presento getPresento() {
        return presento;
    }

    public void setPresento(Presento presento) {
        this.presento = presento;
    }
}
