package Calculator;

import java.util.Scanner;

public class Process {
    static int currentNumber, currentOperator, myInt1, myInt2, operator, result;

    public static int backEnd() {
///////// через switch - case /////////
        switch (operator) {
            case 1:
                result = myInt1 + myInt2;
                break;
            case 2:
                result = myInt1 - myInt2;
                break;
            case 3:
                result = myInt1 * myInt2;
                break;
            case 4:
                result = myInt1 / myInt2;
                break;
            default:
                System.out.println("Я еще не придумал, как это починить");
//                operatorVerify();
        }
        return result;
/////////// через if - else ///////////
/*        if (operator.equals("+")) {
            result = (myInt1 + myInt2);
        } else if (operator.equals("-")) {
            result = (myInt1 - myInt2);
        } else if (operator.equals("*")) {
            result = (myInt1 * myInt2);
        } else if (operator.equals("/")) {
            result = (myInt1 / myInt2);
        }return result;*/
    }

}
