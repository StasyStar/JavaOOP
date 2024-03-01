package Model.impl;

import Model.Operation;
import Model.UserNumber;

public class UserOperation implements Operation {

    @Override
    public UserNumber sum(UserNumber a, UserNumber b) {
        return new UserNumber(a.getRealNum() + b.getRealNum(), a.getImaginaryNum() + b.getImaginaryNum());
    }

    @Override
    public UserNumber multi(UserNumber a, UserNumber b) {
        return new UserNumber(a.getRealNum() * b.getRealNum() - a.getImaginaryNum() * b.getImaginaryNum(), a.getRealNum() * b.getImaginaryNum() + a.getImaginaryNum() * b.getRealNum());
    }

    @Override
    public UserNumber divide(UserNumber a, UserNumber b) {
        if (a.getRealNum() == 0 || b.getImaginaryNum() == 0) {
            throw new ArithmeticException("You can't divide by zero!");
        } else {
            double realRes = a.getRealNum() * b.getRealNum() + a.getImaginaryNum() * b.getImaginaryNum() / b.getRealNum() * b.getRealNum() + b.getImaginaryNum() * b.getImaginaryNum();
            double imaginaryRes = a.getImaginaryNum() * b.getRealNum() - a.getRealNum() * b.getImaginaryNum() / b.getRealNum() * b.getRealNum() + b.getImaginaryNum() * b.getImaginaryNum();
            return new UserNumber(realRes, imaginaryRes);
        }
    }
}
