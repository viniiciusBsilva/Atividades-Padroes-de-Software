public class TesteNumeroDecorado {
    public static void main(String[] args) {
        Numero numero = new NumeroUm();
        numero.imprimir();

        System.out.println();

        numero = new ParenteseDecorator(numero);
        numero.imprimir();

        System.out.println();

        numero = new ColcheteDecorator(numero);
        numero.imprimir();

        System.out.println();

        numero = new ChaveDecorator(numero);
        numero.imprimir();

        System.out.println();

        numero = new ColcheteDecorator(new ChaveDecorator(new ParenteseDecorator(new NumeroUm())));
        numero.imprimir();

        System.out.println();

        numero = new ChaveDecorator(new ColcheteDecorator(new ParenteseDecorator(new NumeroUm())));
        numero.imprimir();

        System.out.println();

        numero = new ParenteseDecorator(new ChaveDecorator(new ColcheteDecorator(new NumeroUm())));
        numero.imprimir();
    }
}
