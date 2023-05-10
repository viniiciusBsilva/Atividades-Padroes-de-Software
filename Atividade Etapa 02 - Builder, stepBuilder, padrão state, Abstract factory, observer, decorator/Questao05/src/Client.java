import Factory.LocalidadeBrasilFactory;
import Factory.LocalidadeEUAFactory;
import Factory.abstractFactory.LocalidadeAbstractFactory;
import model.data.Data;
import model.moeda.Moeda;

public class Client {
    public static void main(String[] args) {
        LocalidadeAbstractFactory factoryBR = new LocalidadeBrasilFactory();
        LocalidadeAbstractFactory factoryEUA = new LocalidadeEUAFactory();

        Data dataBR = factoryBR.getData(15, 05, 2023);
        Data dataEUA = factoryEUA.getData(9, 05, 2023);
        System.out.println("Data formatada Brasil: " + dataBR.getDataFormatada());
        System.out.println("Data formatada Estados Unidos: " + dataEUA.getDataFormatada());

        Moeda moedaBR = factoryBR.getMoeda(1550.5);
        Moeda moedaEUA = factoryEUA.getMoeda(2230.0);
        System.out.println("Valor formatado Brasil: " + moedaBR.getSimbolo() + " " + moedaBR.getValorFormatado());
        System.out.println("Valor formatado Estados Unidos: " + moedaEUA.getSimbolo() + " " + moedaEUA.getValorFormatado());
    }
}
