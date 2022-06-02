package Questão08;

public class StrategyPagamentoAVistaImpresso implements StrategyDesconto{

    @Override
    public double calculaDesconto(Artigos artigos) {
        double aux =0;
        if(artigos.getTipo().equals("IMPRESSO")||artigos.getTipo().equals("TABULEIRO")) {
            aux = artigos.getPreço() * 0.30;
        }else if(!artigos.getTipo().equals("DIGITAL")){
            aux = artigos.getPreço() * 0.15;
        }
        return aux;
    }
}
