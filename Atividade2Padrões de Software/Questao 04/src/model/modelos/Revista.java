package model.modelos;

import model.enumTipos.TipoDeLivroERevista;

public class Revista implements Artigo{
    private String nome;
    private TipoDeLivroERevista tipoDeLivroERevista;
    private Double preco;
    private String descricao;

    public Revista(String nome, TipoDeLivroERevista tipoDeLivroERevista, Double preco, String descricao) {
        this.nome = nome;
        this.tipoDeLivroERevista = tipoDeLivroERevista;
        this.preco = preco;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoDeLivroERevista getTipoDeLivroERevista() {
        return tipoDeLivroERevista;
    }

    public void setTipoDeLivroERevista(TipoDeLivroERevista tipoDeLivroERevista) {
        this.tipoDeLivroERevista = tipoDeLivroERevista;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreço(Double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
