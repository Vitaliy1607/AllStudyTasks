import java.util.Scanner;

public class Cycle9 {
    public static void main(String[] args) {
        int n,s,i,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Vvedite chislo: ");
        if(sc.hasNextInt()) {
            n = sc.nextInt();
            b = n;
            s = 0;
            i = 0;
            while(n!=0) {
                s = s+n%10;
                n = n/10;
                i++;
            }
            System.out.println("Summa sifr chisla "+b+" = "+s+", a kolichestvo sifr v nem: "+i);
        } else {
            System.out.println("Vi vveli nepravilnoje chislo");
        }
    }
}
