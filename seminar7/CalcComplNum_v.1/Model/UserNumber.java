package Model;

public class UserNumber {
    private double realNum;
    private double imaginaryNum;

    public UserNumber(double realNum, double imaginaryNum) {
        this.realNum = realNum;
        this.imaginaryNum = imaginaryNum;
    }

    public double getRealNum() {
        return realNum;
    }

    public void setRealNum(double realNum) {
        this.realNum = realNum;
    }

    public double getImaginaryNum() {
        return imaginaryNum;
    }

    public void setImaginaryNum(double imaginaryNum) {
        this.imaginaryNum = imaginaryNum;
    }

    @Override
    public String toString() {
        return "(" + realNum + ", " + imaginaryNum + ")";
    }
}