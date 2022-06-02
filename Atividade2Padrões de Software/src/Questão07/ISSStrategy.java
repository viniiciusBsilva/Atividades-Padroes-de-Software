package Questão07;

public class ISSStrategy implements Imposto{

    @Override
    public Double calculaImposto(Orçamento orçamento){
        return orçamento.getValor() * 0.06;
    }

}
