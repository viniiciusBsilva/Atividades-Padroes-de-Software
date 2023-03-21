package service.strategies;

import model.modelos.Artigo;

public class DescontoDe15Porcento implements PagamentoStrategy{

    @Override
    public double aplicarDesconto(Artigo artigo) {
        return artigo.getPreco()*0.85;
    }
}
