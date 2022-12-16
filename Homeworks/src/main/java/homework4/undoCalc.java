package homework4;

import java.util.LinkedList;
import java.util.Scanner;


public class undoCalc {
    public static void main(String[] args) {

        LinkedList<Integer> operations = new LinkedList<>();

        System.out.println("calculator");
        calculateString(operations);

    }
    private static void calculateString(LinkedList<Integer> operations) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1 value: ");
        int firstValue = in.nextInt();
        System.out.print("Enter 2 value: ");
        int secondValue = in.nextInt();
        System.out.print("Input operator: ");
        String operator = in.next();

        in.close();

        StringBuilder result = new StringBuilder();
        int answer = 0;
        switch (operator) {
            case "/" -> {
                if (secondValue != 0) {
                    answer = firstValue / secondValue;
                    result.append(firstValue).append(operator).append(secondValue).append("=").append(answer);
                } else {
                    result.append("Not supported division by zero");
                }
            }
            case "*" -> {
                answer = firstValue * secondValue;
                result.append(firstValue).append(operator).append(secondValue).append("=").append(answer);
            }
            case "-" -> {
                answer = firstValue - secondValue;
                result.append(firstValue).append(operator).append(secondValue).append("=").append(answer);
            }
            case "+" -> {
                answer = firstValue + secondValue;
                result.append(firstValue).append(operator).append(secondValue).append("=").append(answer);
            }
            case "undo" -> {
                operations.removeLast();
            }
            default -> result.append("can't count");
        }
        operations.add(answer);
        System.out.printf("%d %s %d = %d", firstValue, operator, secondValue, answer);
    }
}
