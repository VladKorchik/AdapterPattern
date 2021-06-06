package ru.netology;

public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() { this.target = new Calculator(); }

    @Override
    public int sum(int arg0, int arg1) {
        double returnValue = IntsCalculator.this.target
                .newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
        int roundReturnValue = (int)Math.round(returnValue);
        return roundReturnValue;
    }

    @Override
    public int mult(int arg0, int arg1) {
        double returnValue = IntsCalculator.this.target
                .newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
        int roundReturnValue = (int)Math.round(returnValue);
        return roundReturnValue;
    }

    @Override
    public int pow(int a, int b) {
        double returnValue = IntsCalculator.this.target
                .newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
        int roundReturnValue = (int)Math.round(returnValue);
        return roundReturnValue;
    }
}