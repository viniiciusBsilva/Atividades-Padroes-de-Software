package Questão11;

public class FormatacaoCSV implements Formatacao{
    private Formatacao proxima;

    @Override
    public String obterFormato(Formato formato) {
        if(formato.equals("CSV")){
            return "Requisição tipo CSV";
        }
        return null;
    }

    @Override
    public void setProximo(Formatacao proxima) {
        this.proxima= proxima;
    }
}
