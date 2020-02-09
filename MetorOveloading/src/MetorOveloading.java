
public class MetorOveloading {
// програма додавання
	public static void main(String[] args) {
		
		System.out.println(dodaty(1,3));
		System.out.println(dodaty(1,4,6));
		System.out.println(dodaty(1,6));
		System.out.println(dodaty("Sobaka","-Barabaka"));
		


	}
   public static int dodaty(int a, int b) {
	   return a + b;
   }
   public static int dodaty(int a , int b, int c) {  // перевантажені методи
	   return a+b+c;
   }
   public static double dodaty(double a, double b) {
	   return a+b;
   }
   public static String dodaty(String a, String b) {
	   return a + b;
   }
   public static int dodaty(int[] iArray) {
	   int sum = 0;
	   for(int i: iArray) {
		   sum+=i;
   }
   return sum;
   }
}
