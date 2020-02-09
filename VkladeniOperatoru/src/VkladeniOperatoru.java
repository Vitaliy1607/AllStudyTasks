
public class VkladeniOperatoru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int age = 14;
       
       if(age<=18) {
    	   System.out.println("Ви неповнолітній");
    	   if(age > 11) {                                            // ВКЛАДЕНИЙ ОПЕРАТОР
    		   System.out.println("Вам ще чуть чуть до повноліття"); // ТОБТО IF ВКЛАДЕНИЙ В IF АБО SWITCH ЧИ WHILE В IF ЧИ НАОБОРОТ
    	   }
       }else {System.out.println("Ви повнолітній");
       }
	}

}
