
public class MetodReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             String say = sayHello("hellow ", "viktor");
             System.out.println(say);
	}
	public static String sayHello(String hello, String name) {
		String say = hello + name;
		return say;              
	}
}
