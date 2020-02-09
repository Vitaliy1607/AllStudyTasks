public class koren {
    public static void main(String[] args) {
        double x1, x2;
        int a = 5;
        int b = 10;
        int c = 5;
        double d = (b*b)-(4*a*c);

        if (d> 0){
            x1 = -b + Math.sqrt(d)/(2*a);
            x2 = -b - Math.sqrt(d)/(2*a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }else if (d == 0){
            x1 = -b/(2*a);
            System.out.println("x1 = " + x1);
        }else {
            System.out.println("Даное решение не имеет корней");
        }
    }
}
