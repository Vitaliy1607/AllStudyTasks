// 1 3 5 7 9 11

public class cycle2 {
    public static void main(String[] args) {
//        int n = 55;
//        for (int i = 1;i<n; i++){
//            if (i%2 == 0){
//                continue;
//            }
//            System.out.println(i);
//
//        }
        for (int i = 0, n = 1;i<=55;n = n + 2, i++){
            System.out.print(n + " ");
        }
    }
}
