package Questão10;

public class Saque {
    private double valor;
    private Notas notas;

    public Saque(){
    }

    public Saque(Double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double requisitarSaque(){
        return notas.calculaQtdNotas(getValor());
    }

}
