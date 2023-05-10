package Factory;

import Factory.abstractFactory.LocalidadeAbstractFactory;
import model.data.Data;
import model.data.DataEUA;
import model.moeda.Moeda;
import model.moeda.MoedaEUA;

public class LocalidadeEUAFactory implements LocalidadeAbstractFactory {
    @Override
    public Moeda getMoeda(double valor) {
        return new MoedaEUA(valor);
    }
    @Override
    public Data getData(int mes, int dia, int ano){
        return new DataEUA(mes, dia, ano);
    }
}
