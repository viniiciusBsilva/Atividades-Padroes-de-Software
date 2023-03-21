package service.strategies;

import model.modelos.Artigo;

public interface PagamentoStrategy {
    double aplicarDesconto(Artigo artigo);
}
