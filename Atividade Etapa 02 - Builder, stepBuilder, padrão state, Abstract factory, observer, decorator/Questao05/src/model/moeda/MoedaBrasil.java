package model.moeda;

import model.moeda.Moeda;

import java.text.DecimalFormat;

public class MoedaBrasil extends Moeda {
    public MoedaBrasil(double valor) {
        super(valor);
    }
    @Override
    public String getSimbolo() {
        return "R$";
    }
    @Override
    public String getValorFormatado() {
        DecimalFormat df = new DecimalFormat("###,##0.00");
        return df.format(valor);
    }
}
