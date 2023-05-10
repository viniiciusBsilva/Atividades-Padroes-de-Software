interface EstadoProcesso {
    void avaliar(Processo processo);
    void deferir(Processo processo);
    void indeferir(Processo processo);
    void fechar(Processo processo);
}
