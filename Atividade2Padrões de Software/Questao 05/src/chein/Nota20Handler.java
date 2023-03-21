package chein;

import chein.Handler;

public class Nota20Handler extends Handler {
    public Nota20Handler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValorNota() {
        return 20;
    }
}
