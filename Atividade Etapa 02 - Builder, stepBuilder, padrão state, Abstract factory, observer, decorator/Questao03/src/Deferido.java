package org.example.quest3;

class Deferido implements EstadoProcesso {
    public void avaliar(Processo processo) {
        // não faz nada
    }
    public void deferir(Processo processo) {
        // não faz nada
    }
    public void indeferir(Processo processo) {
        // não faz nada
    }
    public void fechar(Processo processo) {
        processo.setEstado(new Fechado());
    }
}
