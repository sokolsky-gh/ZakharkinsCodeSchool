package Calculator;

import java.util.Scanner;

public class Input {
    public static void frontEnd() {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите первое число");
        Input.numberVerify();
        Calculator.Process.myInt1 = Calculator.Process.currentNumber;
        Input.operatorVerify();
        //пока ввод не равен 1.2.3.4 выводим
        // System.out.println("ХЗ, че эт за операция, выберите операцию из предложенного");
        // и снова ждём корректного ввода
        Process.operator = Process.currentOperator;
        System.out.println("Введите второе число");
        Input.numberVerify();
        Calculator.Process.myInt2 = Calculator.Process.currentNumber;
        Calculator.Process.backEnd();

    }

    public static int numberVerify() {
        Scanner s = new Scanner(System.in);
        while (!s.hasNextInt()) {
            System.out.println("Вы ввели не число, введите блть число пожалуйста");
            s.nextLine();
        }
        Process.currentNumber = s.nextInt();
        return Process.currentNumber;

    }

    public static int operatorVerify() {
        System.out.println("Вы должны выбрать номер желаемой операции:\n" +
                "1. Сложение\n" + "2. Вычитание\n" + "3. Умножение\n" + "4. Деление");
        Scanner s = new Scanner(System.in);
        while (!s.hasNextInt()) {
            System.out.println("Введите блть корректную команду пожалуйста");
            s.nextLine();
        }
        switch (s.nextInt()) {
            case 1:
            case 2:
            case 3:
            case 4:
                Process.currentOperator = s.nextInt();
                //вот здесь консоль просит дважды ввести операцию, хз чонетак
                break;
            default:
                System.out.println("Введите блть корректную команду пожалуйста");
                s.nextLine();
        }
        return Process.currentOperator;
        //Process.currentOperator = s.nextInt();
    }
}
