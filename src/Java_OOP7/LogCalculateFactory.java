package calculator;

public class LogCalculateFactory implements ICalculateFactory {
    private Loggable logger;

    public LogCalculateFactory(Loggable logger) {
        this.logger = logger;
    }

    @Override
    public Calculate create(int primaryArg) {
        return new LogCalculate(new Calculator(primaryArg),logger);
    }

}


