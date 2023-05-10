class EmAvaliacao implements EstadoProcesso {
    public void avaliar(Processo processo) {
        processo.setEstado(new Deferido());
        processo.avisarInteressado();
    }
    public void deferir(Processo processo) {
    }
    public void indeferir(Processo processo) {
    }
    public void fechar(Processo processo) {
    }
}
