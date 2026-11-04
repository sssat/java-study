public class Main {

    @FunctionalInterface 
    interface Calculator {
        int calculate(int a , int b);
    }
    public static void main(String[] args) {
        Calculator calc = (a, b) -> a + b;
        System.out.println(calc.calculate(5, 4));
        System.out.println(calc.calculate(99, 99));
    }
}