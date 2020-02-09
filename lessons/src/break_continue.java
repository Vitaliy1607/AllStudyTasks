public class break_continue {
    public static void main(String[] args) {
        int a = 0;
        while (true){
            if (a >= 15)
                break;
            System.out.println(a);
            a++;
        }
        System.out.println("Мы вышли из цикла!");
        for (int i = 0; i <= 15;i++) {
            if (i % 2 == 0){
            continue;}
            System.out.println("непарное число"+i);
        }

    }
    }

