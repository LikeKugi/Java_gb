package homework2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Logger;

public class ex4 {
    /**
     * К калькулятору из предыдущего дз добавить логирование.
     */
    private static Logger logger = Logger.getLogger(ex4.class.getName());

    public static void main(String[] args) {
        calculateString();
    }

    private static void calculateString() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1 value: ");
        int firstValue = in.nextInt();
        System.out.print("Enter 2 value: ");
        int secondValue = in.nextInt();
        System.out.print("Input operator: ");
        String operator = in.next();

        in.close();

        StringBuilder result = new StringBuilder();

        switch (operator) {
            case "/" -> {
                if (secondValue != 0) {
                    result.append(firstValue).append(operator).append(secondValue).append("=").append(firstValue/secondValue);
                } else {
                    result.append("Not supported division by zero");
                }
            }
            case "*" -> result.append(firstValue).append(operator).append(secondValue).append("=").append(firstValue*secondValue);
            case "-" -> result.append(firstValue).append(operator).append(secondValue).append("=").append(firstValue-secondValue);
            case "+" -> result.append(firstValue).append(operator).append(secondValue).append("=").append(firstValue+secondValue);
            default -> result.append("can't count");
        }
        try(PrintWriter out = new PrintWriter("calc.txt")) {
            out.println(result);
            logger.info("logging successes");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
