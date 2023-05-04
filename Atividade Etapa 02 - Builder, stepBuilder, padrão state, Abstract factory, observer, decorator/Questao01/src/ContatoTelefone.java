class ContatoTelefone extends Contato{
    protected String telefone;
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return super.toString() + ", Telefone: " + telefone;
    }
}
