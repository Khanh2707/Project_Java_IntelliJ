package CalculatorCoBan.Model;

public class Model_Calculator {
    private double firstValue;
    private double secondValue;
    private double answer;

    public Model_Calculator() {

    }

    public void setFirstValue(double firstValue) {
        this.firstValue = firstValue;
    }

    public void setSecondValue(double secondValue) {
        this.secondValue = secondValue;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }

    public double getFirstValue() {
        return firstValue;
    }

    public double getSecondValue() {
        return secondValue;
    }

    public double getAnswer() {
        return answer;
    }

    public void plus() {
        this.answer = this.firstValue + this.secondValue;
    }

    public void minus() {
        this.answer = this.firstValue - this.secondValue;
    }

    public void times() {
        this.answer = this.firstValue * this.secondValue;
    }

    public void into() {
        this.answer = this.firstValue - this.secondValue;
    }

    public void pow() {
        this.answer = Math.pow(firstValue,secondValue);
    }

    public void mod() {
        this.answer = this.firstValue % this.secondValue;
    }
}
