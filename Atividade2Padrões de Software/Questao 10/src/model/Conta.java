package model;

public class Conta {
    private String titular;
    private Double saldo;
    private String numeroDaConta;
    private String agencia;

    public Conta(String titular, Double saldo, String numeroDaConta, String agencia) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
    }

    public String getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getAgencia() {
        return agencia;
    }
}
