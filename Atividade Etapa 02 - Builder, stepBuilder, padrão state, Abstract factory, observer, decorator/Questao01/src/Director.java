class Director {
    private Builder builder;
    private Contato contato;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void contruirContatoCompleto(Pessoa pessoa){
        builder.criarNovoContato();
        builder.adicionarNome(pessoa.getNome());
        builder.adicionarEmail(pessoa.getEmail());
        builder.adicionarTelefone(pessoa.getTelefone());
        builder.adicionarEndereco(pessoa.getEndereco());
        contato = builder.getContato();
    }

    public void contruirContatoTelefone(Pessoa pessoa){
        builder.criarNovoContato();
        builder.adicionarNome(pessoa.getNome());
        builder.adicionarTelefone(pessoa.getTelefone());
        contato = builder.getContato();
    }

    public void contruirContatoIntenet(Pessoa pessoa){
        builder.criarNovoContato();
        builder.adicionarNome(pessoa.getNome());
        builder.adicionarEmail(pessoa.getEmail());
        contato = builder.getContato();
    }

    public Contato getContato() {
        return contato;
    }
}
