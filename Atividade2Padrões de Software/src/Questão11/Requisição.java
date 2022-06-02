package Questão11;

public class Requisição {
    private Formato formato;
    private Formatacao form;

    public Requisição(Formato formato) {
        this.formato = formato;
    }

    public String getFormato() {
        return form.obterFormato(this.formato);
    }
}
