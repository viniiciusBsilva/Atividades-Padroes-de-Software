package model.data;

public abstract class Data {
    protected int dia;
    protected int mes;
    protected int ano;
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public abstract String getDataFormatada();
}
