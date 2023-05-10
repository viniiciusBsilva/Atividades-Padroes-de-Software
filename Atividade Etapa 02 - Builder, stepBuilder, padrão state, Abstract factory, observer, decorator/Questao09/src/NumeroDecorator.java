public abstract class NumeroDecorator implements Numero {
    private Numero numero;

    public NumeroDecorator(Numero numero) {
        this.numero = numero;
    }

    public void imprimir() {
        System.out.print(getSimboloAbertura());
        numero.imprimir();
        System.out.print(getSimboloFechamento());
    }

    protected abstract String getSimboloAbertura();

    protected abstract String getSimboloFechamento();
}
