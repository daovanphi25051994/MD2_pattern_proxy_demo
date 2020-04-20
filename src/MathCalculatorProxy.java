public class MathCalculatorProxy implements Calculator {
    private MathCalculator mathCalculator;

    public MathCalculatorProxy() {
        this.mathCalculator = new MathCalculator();
    }

    @Override
    public double getSum(double first, double second) {
        if (first / 2 + second / 2 >= Double.MAX_VALUE / 2) {
            throw new RuntimeException("Out of range");
        }
        if (first / 2 + second / 2 <= Double.MIN_VALUE / 2) {
            throw new RuntimeException("Out of range");
        }
        return mathCalculator.getSum(first, second);
    }

    @Override
    public double getSub(double first, double second) {
        if (first / 2 + second / 2 >= Double.MAX_VALUE / 2) {
            throw new RuntimeException("Out of range");
        }
        if (first / 2 + second / 2 <= Double.MIN_VALUE / 2) {
            throw new RuntimeException("Out of range");
        }
        return mathCalculator.getSub(first, second);
    }

    @Override
    public double getMul(double first, double second) {
        double result = mathCalculator.getMul(first, second);
        if (first != 0 && result / first != second) {
            throw new RuntimeException("Out of range");
        }
        return result;
    }

    @Override
    public double getDiv(double first, double second) {
        if (second == 0) {
            throw new RuntimeException("Can't divide by zero");
        }
        return mathCalculator.getDiv(first, second);
    }
}


