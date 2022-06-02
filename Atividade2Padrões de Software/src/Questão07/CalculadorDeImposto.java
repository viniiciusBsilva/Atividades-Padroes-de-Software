package Questão07;

public class CalculadorDeImposto {
    private Orçamento orçamento;
    private Imposto imposto;

    public CalculadorDeImposto(Orçamento orçamento, Imposto imposto) {
        this.orçamento = orçamento;
        this.imposto = imposto;
    }

    public double calcularImposto(){
        return this.orçamento.getValor() + imposto.calculaImposto(orçamento);
    }
    public String imprimeImposto(){
        return "O Imposto é: " + calcularImposto();
    }

}
