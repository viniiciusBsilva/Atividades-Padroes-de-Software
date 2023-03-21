package model.modelos;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoDeJogo getTipoDeJogo() {
        return tipoDeJogo;
    }

    public void setTipoDeJogo(TipoDeJogo tipoDeJogo) {
        this.tipoDeJogo = tipoDeJogo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
