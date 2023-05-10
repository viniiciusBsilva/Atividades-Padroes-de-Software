package model.data;

import model.data.Data;

public class DataEUA extends Data {
    public DataEUA(int mes, int dia, int ano) {
        super(mes, dia, ano);
    }
    @Override
    public String getDataFormatada() {
        return String.format("%02d/%02d/%04d", mes, dia, ano);
    }
}
