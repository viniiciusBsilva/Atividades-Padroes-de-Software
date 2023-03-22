package model;

import model.enumTipos.TipoDeLivro;
import model.enumTipos.TipoDeRevista;

public class Revista implements Artigo{
    private String nome;
    private TipoDeRevista tipoDeRevista;
    private Double preco;
    private String descricao;

    public Revista(String nome, TipoDeRevista tipoDeRevista, Double preco, String descricao) {
        this.nome = nome;
        this.tipoDeRevista = tipoDeRevista;
        this.preco = preco;
        this.descricao = descricao;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public TipoDeRevista getTipoDeRevista() {
        return tipoDeRevista;
    }

    @Override
    public Double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }
}
