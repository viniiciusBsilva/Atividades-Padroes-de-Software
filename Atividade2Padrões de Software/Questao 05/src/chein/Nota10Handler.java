package chein;

import chein.Handler;

public class Nota10Handler extends Handler {
    public Nota10Handler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValorNota() {
        return 10;
    }
}
