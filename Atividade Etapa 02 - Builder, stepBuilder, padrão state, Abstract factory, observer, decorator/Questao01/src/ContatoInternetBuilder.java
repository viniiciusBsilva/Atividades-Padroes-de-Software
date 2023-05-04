class ContatoInternetBuilder implements Builder{
    private ContatoInternet contatoInternet;

    public void criarNovoContato() {
        contatoInternet = new ContatoInternet();
    }
    public void adicionarNome(String nome) {
        contatoInternet.setNome(nome);
    }
    public void adicionarEndereco(String endereco) {

    }
    public void adicionarEmail(String email) {
        contatoInternet.setEmail(email);
    }
    public void adicionarTelefone(String telefone) {

    }
    public Contato getContato() {
        return contatoInternet;
    }
}
