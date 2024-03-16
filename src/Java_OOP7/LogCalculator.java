package calculator;

public class LogCalculator implements Calculate{
    private Calculate decorated;

    private Loggable logger;

    public LogCalculator( Calculate decorated, Loggable logger){
        this.decorated = decorated;
        this.logger = logger;
    }

    @Override
    public Calculate sum(int arg) {
        int firstArg = decorated.getResult();
        logger.log("Первое значение калькулятора" + firstArg + " Начало вызова метода sum с параметром " + arg);
        Calculate result = decorated.sum(arg);
        logger.log("Вызов метода sum прошел успешно");
        return result;
    }

    @Override
    public Calculate multi(int arg) {
        int firstArg = decorated.getResult();
        logger.log("Первое значение калькулятора" + firstArg + " Начало вызова метода multi с параметром " + arg);
        Calculate result = decorated.multi(arg);
        logger.log("Вызов метода multi прошел успешно");
        return result;
    }

    @Override
    public Calculate del(int arg) {
        int firstArg = decorated.getResult();
        logger.log("Первое значение калькулятора" + firstArg + " Начало вызова метода del с параметром " + arg);
        Calcolate result = decorated.del(arg);
        logger.log("Вызов метода del прошел успешно");
        return result;
    }

    @Override
    public int getResult() {
        int result = decorated.getResult();
        logger.log("Получения результата: " + result);
        return result;
    }
}