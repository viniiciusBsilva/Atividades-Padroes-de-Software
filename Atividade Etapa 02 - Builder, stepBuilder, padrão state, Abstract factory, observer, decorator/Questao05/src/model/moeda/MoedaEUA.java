package org.example.quest5;

import java.text.DecimalFormat;

public class MoedaEUA extends Moeda{
    public MoedaEUA(double valor) {
        super(valor);
    }
    @Override
    public String getSimbolo() {
        return "$";
    }
    @Override
    public String getValorFormatado() {
        DecimalFormat df = new DecimalFormat("###,##0.00");
        return df.format(valor);
    }
}
