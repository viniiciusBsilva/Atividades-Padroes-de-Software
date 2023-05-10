class Processo {
    private EstadoProcesso estado;

    public Processo() {
        this.estado = new EmAvaliacao();
    }

    public void avaliar() {
        estado.avaliar(this);
    }

    public void deferir() {
        estado.deferir(this);
    }

    public void indeferir() {
        estado.indeferir(this);
    }

    public void fechar() {
        estado.fechar(this);
    }

    public void setEstado(EstadoProcesso estado) {
        this.estado = estado;
    }

    public void avisarInteressado() {
        System.out.println("Avisando interessado...");
    }
}
