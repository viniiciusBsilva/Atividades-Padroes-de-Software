import chein.*;

public class CaixaEletronico {
    private Handler primeiroHandler;

    public CaixaEletronico() {
    }

    public void sacar(int valor) {
        System.out.printf("Saque de R$ %d\n", valor);
        primeiroHandler = new Nota100Handler(new Nota50Handler(new Nota20Handler(new Nota10Handler(new Nota5Handler(null)))));
        primeiroHandler.handle(valor);
    }
}
