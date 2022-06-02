package Questão11;

public class FormatacaoXML implements Formatacao{
    private Formatacao proxima;

    @Override
    public String obterFormato(Formato formato) {
        if(formato.equals("XML")){
            return "Requisição tipo XML";
        }
        return null;
    }

    @Override
    public void setProximo(Formatacao proxima) {
        this.proxima= proxima;
    }
}
