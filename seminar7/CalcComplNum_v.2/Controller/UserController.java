package Controller;

import java.util.HashMap;
import java.util.function.BiFunction;

import Model.Operation;
import Model.UserNumber;

public class UserController {
    private final Operation userOperation;
    private final HashMap<String, BiFunction <UserNumber, UserNumber, UserNumber>> map;

    public UserController(Operation userOperation) {
        this.userOperation = userOperation;
        this.map = new HashMap<>();
        this.map.put("+", (a, b) -> sum(a, b));
        this.map.put("*", (a, b) -> multi(a, b));
        this.map.put("/", (a, b) -> divide(a, b));
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

    public UserNumber calculate(UserNumber a, UserNumber b, String operator) {
        if (operator == null) {
            throw new IllegalArgumentException("Invalid operator");
        } else {
            UserNumber finalResult = map.get(operator).apply(a, b);
            return finalResult;
        }
    }
}