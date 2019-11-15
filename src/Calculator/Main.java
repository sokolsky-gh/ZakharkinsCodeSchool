package Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Псс, парень! Хочешь немного повычислять?\n (жми [Enter] для запуска калькулятора)");
        s.nextLine();
        Input.frontEnd();
        System.out.println("Результат вычисления: " + Calculator.Process.result);
        //System.out.println("Продолжаем вычислять?\n[Y] - рестарт программы [N] - выход");
        s.close();

    }

}

