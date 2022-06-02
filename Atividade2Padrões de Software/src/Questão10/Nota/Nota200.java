package Questão10.Nota;

import Questão10.Notas;

public class Nota200 implements Notas {
    private Notas notas;
    @Override
    public double calculaQtdNotas(double valor) {
        double aux;
        int count=0;
        while(valor>=200) {
            aux = valor - 200;
            valor-=200;
            count++;
        }
        return count;
    }

    @Override
    public void setProximo(Notas notas) {
        this.notas = notas;
    }
}
