package calculator;

public class Main {
public static void main(String[]args){
        ICalculateFactory calculateFactory=new CalculateFactory();
        ViewCalculator view=new ViewCalculator(calculateFactory);
        view.run();
        }
    }