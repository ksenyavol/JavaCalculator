package calculator;

public class CalculateFactory implements ICalculateFactory {
    public Calculate create(int primaryArg) {
        return new Calculator(primaryArg);
        }
    }

