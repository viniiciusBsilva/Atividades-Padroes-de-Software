public class ParenteseDecorator extends NumeroDecorator {
    public ParenteseDecorator(Numero numero) {
        super(numero);
    }

    protected String getSimboloAbertura() {
        return "(";
    }

    protected String getSimboloFechamento() {
        return ")";
    }
}