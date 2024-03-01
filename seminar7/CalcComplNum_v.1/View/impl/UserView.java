package impl;
import java.util.Scanner;

import Controller.UserController;
import Model.UserNumber;

public class UserView implements View {
    private UserController userController;

    public UserView(UserController userController) {
        this.userController = userController;
    }

    @Override
    public void run() {
        while (true) {
            String command = prompt("Want to use a calculator? y/n: ").toLowerCase();
            if (command.equals("n")) return;
            else if(command.equals("y")) {
                calculate();
            }
        }
    }

    @Override
    public void calculate() {
        double aReal = Double.parseDouble(prompt("Enter a real number a: "));
        double aImaginary = Double.parseDouble(prompt("Enter an imaginary number a: "));
        String op = prompt("Enter an operation (+, *, /): ");
        double bReal = Double.parseDouble(prompt("Enter a real number b: "));
        double bImaginary = Double.parseDouble(prompt("Enter an imaginary number b: "));

        UserNumber real = new UserNumber(aReal, aImaginary);
        UserNumber imaginary = new UserNumber(bReal, bImaginary);
        UserNumber result;

        switch (op) {
            case "+":
                result = userController.sum(real, imaginary);
                System.out.println("Result: " + result);
                break;
            case "*":
                result = userController.multi(real, imaginary);
                System.out.println("Result: " + result);
                break;

            case "/":
                result = userController.divide(real, imaginary);
                System.out.println("Result: " + result);
                break;

            default:
                System.out.println("Incorrect operator. Choose one of this - +, *, /.");
                break;
        }
    }

    @Override
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}


