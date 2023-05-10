package org.example.quest3;

class EmAvaliacao implements EstadoProcesso {
    public void avaliar(Processo processo) {
        processo.setEstado(new Deferido());
        processo.avisarInteressado();
    }
    public void deferir(Processo processo) {
        // não faz nada
    }
    public void indeferir(Processo processo) {
        // não faz nada
    }
    public void fechar(Processo processo) {
        // não faz nada
    }
}
