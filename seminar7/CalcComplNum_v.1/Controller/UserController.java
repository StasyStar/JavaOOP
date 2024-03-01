package Controller;

import Model.Operation;
import Model.UserNumber;

public class UserController {
    private final Operation userOperation;

    public UserController(Operation userOperation) {
        this.userOperation = userOperation;
    }

    public UserNumber sum(UserNumber a, UserNumber b) {
        UserNumber result = userOperation.sum(a, b);
        return result;
    }

    public UserNumber multi(UserNumber a, UserNumber b) {
        UserNumber result = userOperation.multi(a, b);
        return result;
    }

    public UserNumber divide(UserNumber a, UserNumber b) {
        UserNumber result = userOperation.divide(a, b);
        return result;
    }
}