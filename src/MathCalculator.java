public class MathCalculator implements Calculator {
    @Override
    public double getSum(double first, double second) {
        return first + second;
    }

    @Override
    public double getSub(double first, double second) {
        return first - second;
    }

    @Override
    public double getMul(double first, double second) {
        return first * second;
    }

    @Override
    public double getDiv(double first, double second) {
        return first / second;
    }
}
