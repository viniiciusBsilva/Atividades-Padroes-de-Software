class ContatoCompletoBuilder implements Builder{
    private ContatoCompleto contatoCompleto;

    public void criarNovoContato() {
        contatoCompleto = new ContatoCompleto();
    }

    public void adicionarNome(String nome) {
        contatoCompleto.setNome(nome);
    }

    public void adicionarEndereco(String endereco) {
        contatoCompleto.setEndereco(endereco);
    }

    public void adicionarTelefone(String telefone) {
        contatoCompleto.setTelefone(telefone);
    }

    public void adicionarEmail(String email) {
        contatoCompleto.setEmail(email);
    }

    public Contato getContato() {
        return contatoCompleto;
    }
}
