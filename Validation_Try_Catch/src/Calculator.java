public class Calculator {

    public double div(double d1, double d2)  throws Exception {
        if (d1 == 0 && d2 == 0) {
            throw new Exception("arguments cannot be 0");
        }
        if (d2 == 0) {
            throw new ArithmeticException("second argument cannot be 0");
        }


        return d1 / d2;
    }
}
