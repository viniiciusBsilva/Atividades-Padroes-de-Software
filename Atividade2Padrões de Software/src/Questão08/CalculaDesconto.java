package Questão08;

public class CalculaDesconto {
    private Artigos artigos;
    private StrategyDesconto desconto;

    public CalculaDesconto(Artigos artigos) {
        this.artigos = artigos;
    }

    public double precoDescontado(Artigos artigos){
        return artigos.getPreço() - desconto.calculaDesconto(artigos);
    }
}
