package model;

import model.enumTipos.TipoDeJogo;

public class Jogo implements Artigo{
    private String nome;
    private TipoDeJogo tipoDeJogo;
    private Double preco;
    private String descricao;

    public Jogo(String nome, TipoDeJogo tipoDeJogo, Double preco, String descricao) {
        this.nome = nome;
        this.tipoDeJogo = tipoDeJogo;
        this.preco = preco;
        this.descricao = descricao;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public TipoDeJogo getTipoDeJogo() {
        return tipoDeJogo;
    }

    @Override
    public Double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }
}
