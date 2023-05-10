package Factory.abstractFactory;

import model.data.Data;
import model.moeda.Moeda;

public interface LocalidadeAbstractFactoryy {
    public Moeda getMoeda(double valor);
    public Data getData(int dia, int mes, int ano);
}
