import static java.lang.Math.*;
import java.util.Scanner;

public class HW2_29_09_2018 {
    public static void main(String[] args) {
        float e, f;
        float a = 1;
        float b = 18;
        float c = 27;
        float d = (b*b) - (4*a*c);
        if (d == 0){
            e = -1*(b/(2*a));
            System.out.println("One decision");
        }
        else if (d > 0) {
            e = (-1*b) + (float)(Math.sqrt(d)/(2*a));
            f = (-1*b) - (float)(Math.sqrt(d)/(2*a));
            System.out.println("Two decision: "+e+" "+f+"");
        } else {
            System.out.println("No decision");
        }
        }
    }

