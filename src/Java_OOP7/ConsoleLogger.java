package calculator;

import java.lang.System.Logger;

public class ConsoleLogger implements Loggable{
    public void log(String message) {
        System.out.println("LOG" + message);
    }
}

