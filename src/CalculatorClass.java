class Calculator {
    int a, b;
    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int plus() {
        return a + b;
    }
    public int minus() {
        return a - b;
    }
    public int multi() {
        return a * b;
    }
    public double div() {
        return a / (double)b;
    }
}
public class CalculatorClass {
    public static void main(String[] args) {
        Calculator cal = new Calculator(10, 20);
        System.out.println(cal.plus());
        System.out.println(cal.minus());
        System.out.println(cal.multi());
        System.out.println(cal.div());
    }
}
