import java.util.Random;

public class newarray {
    public static void main(String[] args) {
        int [][] m = new int[3][4];

        Random rnd = new Random();
        for (int i = 0 ; i < m.length; i++){
            for (int j = 0; j< m[i].length; j++){
                m[i][j] = rnd.nextInt(10);                                       // i -рядки j-стовбцы
            }
        }

        for (int i = 0 ; i < m.length; i++){
            for (int j = 0; j< m[i].length; j++){
                System.out.print(m[i][j]+ " ");
            }
            System.out.println();
        }

        int min = m [0] [0];
        for (int i = 0 ; i < m.length; i++){
            for (int j = 0; j< m[i].length; j++){
                           if (min > m[i][j]){
                               min = m[i][j];
                           }
            }
        }

        System.out.println(min);
    }
}
