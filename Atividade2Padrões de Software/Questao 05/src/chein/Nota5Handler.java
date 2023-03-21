package chein;

import chein.Handler;

public class Nota5Handler extends Handler {
    public Nota5Handler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValorNota() {
        return 5;
    }
}
