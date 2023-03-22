package model;

import model.enumTipos.TipoDeLivro;

public class Livro implements Artigo{
    private String nome;
    private TipoDeLivro tipoDeLivro;
    private Double preco;
    private String descricao;

    public Livro(String nome, TipoDeLivro tipoDeLivro, Double preco, String descricao) {
        this.nome = nome;
        this.tipoDeLivro = tipoDeLivro;
        this.preco = preco;
        this.descricao = descricao;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public TipoDeLivro getTipoDeLivro() {
        return tipoDeLivro;
    }

    @Override
    public Double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }
}
