package service;

import model.Artigo;
import model.Jogo;
import model.Livro;
import model.Revista;
import model.enumTipos.TipoDeJogo;
import model.enumTipos.TipoDeLivro;
import model.enumTipos.TipoDeRevista;
import service.strategies.DescontoDe15Porcento;
import service.strategies.DescontoDe30Porcento;
import service.strategies.PagamentoStrategy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Livraria livraria = new Livraria();
        Artigo artigo = new Livro("A arte da guerra", TipoDeLivro.Impresso ,55.00,"Livro de guerra");

        PagamentoStrategy pagamentoStrategy15 = new DescontoDe15Porcento();
        PagamentoStrategy pagamentoStrategy30 = new DescontoDe30Porcento();

        livraria.aplicarDescontoNoArtigo(artigo,pagamentoStrategy15);
        System.out.println("-------------------------------------------");
        livraria.aplicarDescontoNoArtigo(artigo,pagamentoStrategy30);

    }
}
