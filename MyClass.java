class Calculator {
    public double sum(double a, double b){
        return a + b;
    }
}
public class MyClass {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        double result = c.sum(3.5, 2);
        System.out.println(result);

    }
}
