import Controller.UserController;
import Model.Operation;
import Model.impl.UserOperation;
import impl.UserView;

public class ApplicationRunner {
    public static void run() {
        Operation oper = new UserOperation();
        UserController userController = new UserController(oper);
        UserView userView = new UserView(userController);
        userView.run();
    }
}
