package Calculator;

import java.util.Scanner;

public class Input {
    public static void frontEnd() {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите первое число");
        Input.numberVerify();
        Calculator.Process.myInt1 = Calculator.Process.currentNumber;
        System.out.println("Вы должны выбрать номер желаемой операции:\n" +
                "1. Сложение\n" + "2. Вычитание\n" + "3. Умножение\n" + "4. Деление");
        //пока ввод не равен 1.2.3.4 выводим
        // System.out.println("ХЗ, че эт за операция, выберите операцию из предложенного");
        // и снова ждём корректного ввода
        Input.operatorVerify();
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
        Scanner s = new Scanner(System.in);
        while (!s.hasNextInt()) {
            System.out.println("Вы ввели не число, введите блть число пожалуйста");
            s.nextLine();

        }
        Process.currentOperator = s.nextInt();
        //требуем указать значение из диапазона
/*        if (!s.hasNextInt()) { //если не число
            System.out.println("Нужно ввести ЧИСЛО блть из указанного диапазона"); //то укажи число
        }
         else if (s.nextInt() == 1 || s.nextInt() == 2 || s.nextInt() == 3 || s.nextInt() == 4) {
        System.out.println("Нужно ввести число ИЗ УКАЗАННОГО ДИАПАЗОНА блть");
        } else {*/

        return Process.currentOperator;
    }
}
