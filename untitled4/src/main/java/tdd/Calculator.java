package tdd;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by 0"); // Fixed spelling
        }
        return a / b;
    }
    public int add(String numbers) {
        if (numbers.isEmpty()) return 0;
        String[] parts = numbers.split(",");
        int sum = 0;
        for (String num : parts) {
            sum += Integer.parseInt(num.trim());
        }
        return sum;
    }
    public int add(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}