package model.data;

import model.data.Data;

public class DataBrasil extends Data {
    public DataBrasil(int dia, int mes, int ano) {
        super(dia, mes, ano);
    }
    @Override
    public String getDataFormatada() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}
