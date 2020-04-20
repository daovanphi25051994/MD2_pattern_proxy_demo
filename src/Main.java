public class Main {
    public static void main(String[] args) {
        MathCalculatorProxy proxy = new MathCalculatorProxy();
        double sum = proxy.getSum(1, 2);
        System.out.println("1 + 2 = " + sum);
        double div = proxy.getDiv(2, 0);
        System.out.println("2 + Double.MAX_VALUE = " + div);
    }
}
