public class cycle3 {
    public static void main(String[] args) {
        int i = 90;
        while (true){
            System.out.println(i);
            i = i -5;
            if (i == 0){
                break;
            }
        }
    }
}
