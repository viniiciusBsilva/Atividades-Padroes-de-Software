package service;

import model.Conta;
import service.template.RelatorioBancario;
import service.template.RelatorioComplexo;
import service.template.RelatorioSimples;

import java.util.ArrayList;
import java.util.List;

public class GeradorDeRelatorios {
    public static void main(String[] args) {
        ArrayList<Conta> contas = new ArrayList<>();
        Conta conta = new Conta("vinicius", 123.00,"1234","aaa");
        Conta conta2 = new Conta("maria", 1234.00,"1233","aab");
        contas.add(conta);
        contas.add(conta2);

        // gerar relatório simples
        RelatorioBancario relatorioSimples = new RelatorioSimples();
        relatorioSimples.gerarRelatorio(contas);
        System.out.println("\n---------------------------------------------\n");
        // gerar relatório complexo
        RelatorioBancario relatorioComplexo = new RelatorioComplexo();
        relatorioComplexo.gerarRelatorio(contas);
    }

}
