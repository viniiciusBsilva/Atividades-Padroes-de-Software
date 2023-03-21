package chein;

import chein.Handler;

public class Nota100Handler extends Handler {
    public Nota100Handler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValorNota() {
        return 100;
    }
}
