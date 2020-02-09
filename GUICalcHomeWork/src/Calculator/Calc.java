package Calculator;

public class Calc {
    private double a;
    private double b;
    private String operator;
    private Double res;

    public Calc(double a, double b, String operator, Double res) {
        this.a = a;
        this.b = b;
        this.operator = operator;
        this.res = res;
    }

    @Override
    public String toString() {
        return "Calc{" +
                "a=" + a +
                ", b=" + b +
                ", operator='" + operator + '\'' +
                ", res=" + res +
                '}';
    }
}
