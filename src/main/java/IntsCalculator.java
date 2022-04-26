public class IntsCalculator implements Ints{
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg1, int arg2) {
        return (int)target.newFormula()
                        .addOperand(arg1)
                        .addOperand(arg2)
                        .calculate(Calculator.Operation.SUM)
                        .result();
    }

    @Override
    public int mult(int arg1, int arg2) {
        return (int)target.newFormula()
                .addOperand(arg1)
                .addOperand(arg2)
                .calculate(Calculator.Operation.MULT)
                .result();
    }

    @Override
    public int pow(int arg1, int arg2) {
        return (int)target.newFormula()
                .addOperand(arg1)
                .addOperand(arg2)
                .calculate(Calculator.Operation.POW)
                .result();
    }
}
