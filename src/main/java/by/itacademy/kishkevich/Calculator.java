package by.itacademy.kishkevich;

public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public String sum(String a, String b) {
        return String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public String subtract(String a, String b) {
        return String.valueOf(Integer.parseInt(a) - Integer.parseInt(b));
    }
}
