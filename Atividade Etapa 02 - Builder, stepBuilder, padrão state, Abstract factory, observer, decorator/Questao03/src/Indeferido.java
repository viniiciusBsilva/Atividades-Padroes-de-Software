class Indeferido implements EstadoProcesso{
    public void avaliar(Processo processo) {
    }
    public void deferir(Processo processo) {
    }
    public void indeferir(Processo processo) {
    }
    public void fechar(Processo processo) {
        processo.setEstado(new Fechado());
    }
}
