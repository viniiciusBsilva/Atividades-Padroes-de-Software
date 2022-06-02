package Questão11;

public class FormatacaoJSON implements Formatacao{
    private Formatacao proxima;

    @Override
    public String obterFormato(Formato formato) {
        if(formato.equals("JSON")){
            return "Requisição tipo JSON";
        }
        return null;
    }

    @Override
    public void setProximo(Formatacao proxima) {
        this.proxima= proxima;
    }
}
