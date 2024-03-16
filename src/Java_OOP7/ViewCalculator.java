package calculator;

import java.util.Scanner;

public class ViewCalculator {
    public ViewCalculator(ICalculateFactory calculateFactory) {
        this.calculateFactory = calculateFactory;
    }
    public void run() {
        while (true) {
            int primaryArg = promptInt("Введите первый аргумент: ");
            Calculate calculator = calculateFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*, +, -, /, = ) : ");
                if (cmd.equals("*")) {
                    int arg = promptInt("Введите следующий аргумент: ");
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    int arg = promptInt("Введите следующий аргумент: ");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("-")) {
                    int arg = promptInt("Введите следующий аргумент: ");
                    calculator.min(arg);
                    continue;
                }
                if (cmd.equals("/")) {
                    int arg = promptInt("Введите следующий аргумент: ");
                    calculator.del(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    int result = calculator.getResult();
                    System.out.printf"Результат %d/n",result);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
