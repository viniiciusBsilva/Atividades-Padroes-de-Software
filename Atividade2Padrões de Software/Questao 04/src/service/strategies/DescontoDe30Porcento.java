package service.strategies;

import model.modelos.Artigo;

public class DescontoDe30Porcento implements PagamentoStrategy{

    @Override
    public double aplicarDesconto(Artigo artigo) {
        return artigo.getPreco()*0.70;
    }
}
