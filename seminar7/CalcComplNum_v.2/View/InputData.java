

import java.util.Scanner;
import Model.UserNumber;

public class InputData {
    public UserNumber getNumber() {
        double Real = Double.parseDouble(prompt("Enter a real number: "));
        double Imaginary = Double.parseDouble(prompt("Enter an imaginary number: "));
        UserNumber num = new UserNumber(Real, Imaginary);
        return num;
    }

    public String getOperator() {
        String op = prompt("Enter an operation (+, *, /): ");
        return op;
    }

    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
