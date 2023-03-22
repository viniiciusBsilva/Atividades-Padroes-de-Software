package service.template;

import model.Conta;

public class RelatorioSimples extends RelatorioBancario {

    protected void imprimirCabecalho() {
        System.out.println("Banco aaa");
    }

    protected void imprimirRodape() {
        System.out.println("(99) 99999-9999");
    }

    protected void imprimirDadosConta(Conta conta) {
        System.out.println("Titular: " + conta.getTitular() + " - Saldo: " + conta.getSaldo());
    }
}
