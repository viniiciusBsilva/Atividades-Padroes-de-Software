package Questão07;

public class ICMSStrategy implements Imposto{

    @Override
    public Double calculaImposto(Orçamento orçamento){
        return orçamento.getValor() * 0.25;
    }

}
