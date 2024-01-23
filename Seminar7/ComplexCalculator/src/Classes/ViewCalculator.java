package Classes;

import java.util.Scanner;

import Interfaces.iCalculableComplex;

public class ViewCalculator {

    private iCalculableComplex calculator;

    public ViewCalculator(iCalculableComplex calculator) {
        this.calculator = calculator;
    }

    public void run() {
        while (true) {
            double realPart = (double)promptInt("Введите действительную часть первого числа: ");
            double complexPartPart = (double)promptInt("Введите комплексную часть первого числа: ");
            ComplexNumber primaryArg = new ComplexNumber(realPart, complexPartPart);
            System.out.println("Введеное комплексное число: " + primaryArg.toString());
            calculator.sum(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*, +, /, =) : ");
                if (cmd.equals("*")) {
                    ComplexNumber arg = promptComplex();
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    ComplexNumber arg = promptComplex();
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("/")) {
                    ComplexNumber arg = promptComplex();
                    calculator.div(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    String result = calculator.getResult();
                    System.out.printf("Результат \n" + result + "\n");
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
    private ComplexNumber promptComplex() {
        double realPart1 = (double)promptInt("Введите действительную часть второго числа: ");
        double complexPartPart1 = (double)promptInt("Введите комплексную часть второго числа: ");
        ComplexNumber arg = new ComplexNumber(realPart1, complexPartPart1);
        System.out.println("Введеное комплексное число: " + arg.toString());
        return arg;
    }
}