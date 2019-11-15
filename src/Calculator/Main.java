package Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String statusCode = "Y";
        Scanner s = new Scanner(System.in);
        do {
            System.out.print("Псс, парень! Хочешь немного повычислять?\n (жми [Enter] для запуска калькулятора)");
            s.nextLine();
            Input.frontEnd();
            System.out.println("Результат вычисления: " + Calculator.Process.result);
            System.out.println("\nПродолжаем вычислять?\n[Y] - рестарт программы [Enter] - выход");
            statusCode = s.nextLine();
        }
        while (statusCode.equals("Y"));
        s.close();
    }

}

