package service;

import model.Artigos;
import model.modelos.Artigo;
import service.strategies.PagamentoStrategy;

public class Livraria {
    private Artigos artigos;
    private PagamentoStrategy pagamentoStrategy;

    public void aplicarDescontoNoArtigo(Artigo artigo, PagamentoStrategy pagamentoStrategy){
        double valor = pagamentoStrategy.aplicarDesconto(artigo);
        System.out.println(valor);
    }

}
