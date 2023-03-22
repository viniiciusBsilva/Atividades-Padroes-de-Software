package service;

import model.Artigo;
import service.strategies.PagamentoStrategy;

public class Livraria {
    private PagamentoStrategy pagamentoStrategy;

    public void aplicarDescontoNoArtigo(Artigo artigo, PagamentoStrategy pagamentoStrategy){
        double valor = pagamentoStrategy.aplicarDesconto(artigo);
        System.out.println("Valor com desconto: " + valor);
    }

}
