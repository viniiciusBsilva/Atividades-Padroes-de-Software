package service.strategies;

import model.Artigo;

public interface PagamentoStrategy {
    double aplicarDesconto(Artigo artigo);
}
