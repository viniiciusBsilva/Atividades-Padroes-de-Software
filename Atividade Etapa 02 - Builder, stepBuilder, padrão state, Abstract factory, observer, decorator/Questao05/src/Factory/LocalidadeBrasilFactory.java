package Factory;

import Factory.abstractFactory.LocalidadeAbstractFactory;
import model.data.Data;
import model.data.DataBrasil;
import model.moeda.Moeda;
import model.moeda.MoedaBrasil;

public class LocalidadeBrasilFactory implements LocalidadeAbstractFactory {
    @Override
    public Moeda getMoeda(double valor) {
        return new MoedaBrasil(valor);
    }
    @Override
    public Data getData(int dia, int mes, int ano){
        return new DataBrasil(dia, mes, ano);
    }
}
