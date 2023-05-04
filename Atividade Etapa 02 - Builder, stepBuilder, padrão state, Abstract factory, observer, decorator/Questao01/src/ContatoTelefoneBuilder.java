class ContatoTelefoneBuilder implements Builder{
    private ContatoTelefone contatoTelefone;

    public void criarNovoContato() {
        contatoTelefone = new ContatoTelefone();
    }
    public void adicionarNome(String nome) {
        contatoTelefone.setNome(nome);
    }
    public void adicionarEndereco(String endereco) {

    }
    public void adicionarEmail(String email) {

    }
    public void adicionarTelefone(String telefone) {
        contatoTelefone.setTelefone(telefone);
    }
    public Contato getContato() {
        return contatoTelefone;
    }
}
