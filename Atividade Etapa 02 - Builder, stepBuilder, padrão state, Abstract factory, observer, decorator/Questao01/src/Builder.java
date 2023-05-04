interface Builder {
    void criarNovoContato();
    void adicionarNome(String nome);
    void adicionarEndereco(String endereco);
    void adicionarEmail(String email);
    void adicionarTelefone(String telefone);
    Contato getContato();
}
