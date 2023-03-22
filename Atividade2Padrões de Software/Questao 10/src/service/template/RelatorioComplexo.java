package service.template;

import model.Conta;

import java.time.LocalDate;

public class RelatorioComplexo extends RelatorioBancario {

    protected void imprimirCabecalho() {
        System.out.println("Banco aaa - Av. Do Norte, 111 - (99) 99999-9999");
        System.out.println("Data: " + LocalDate.now());
    }

    protected void imprimirRodape() {
        System.out.println("E-mail: contato@bancoaaa.com.br");
    }

    protected void imprimirDadosConta(Conta conta) {
        System.out.println("Titular: " + conta.getTitular() + " - Agência: " + conta.getAgencia() +
                " - Número da Conta: " + conta.getNumeroDaConta() + " - Saldo: " + conta.getSaldo());
    }
}
