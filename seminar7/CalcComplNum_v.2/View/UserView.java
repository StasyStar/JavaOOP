import java.util.Scanner;
import Controller.UserController;
import Model.UserNumber;

public class UserView implements Viewable {
    private UserController userController;
    private InputData data;

    public UserView(UserController userController) {
        this.userController = userController;
        this.data = data;
    }

    @Override
    public void run() {
        while (true) {
            String command = prompt("Want to use a calculator? y/n: ").toLowerCase();
            if (command.equals("n")) {
                return;
            } else if(command.equals("y")) {
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
        UserNumber a = new UserNumber(aReal, aImaginary);
        UserNumber b = new UserNumber(bReal, bImaginary);
        // UserNumber a = data.getNumber();
        // UserNumber b = data.getNumber();
        // String op = data.getOperator();
        UserNumber result = userController.calculate(a, b, op);
        System.out.println("Result: " + result);
    }

    @Override
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}


