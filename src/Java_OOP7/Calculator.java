package calculator;

public final class Calculator implements Calculate{
    private int primaryArg;

    public Calculator(int primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public Calculate sum(int arg) {
        primaryArg += arg;
        return this;
    }

    @Override
    public Calculate min(int arg) {
        primaryArg -= arg;
        return this;
    }

    @Override
    public Calculate del(int arg) {
        primaryArg /= arg;
        return this;
    }

    @verride
    public Calculate multi(int arg) {
        primaryArg *= arg;
        return this;
    }

    @Override
    public int getResult() {
        return primaryArg;
    }
}
