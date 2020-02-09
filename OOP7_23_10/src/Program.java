import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Program {

	public static void main(String[] args) {
		Collection<String> col = new ArrayDeque<>();
		
		System.out.println(col.size());
		col.add("Two");
		col.add("One");
		col.add("Two");
		col.add("Three");
		col.add("Two");
	
		while(col.remove("Two"));
		
		
//		System.out.println(col.size());
//		
//		System.out.println(col.contains("Two"));
//		System.out.println(col.contains("Sasa"));
//
//		System.out.println(col.remove("vvv"));
//		System.out.println(col.remove("Two"));
//		
		
		System.out.println(col);
//
//		for( String str : col) {
//			
//			}
//		Integer integer = new Integer(33);
//		Integer integer2 = 55;  // boxing
//		Integer integer3 = integer + integer2;
//        System.out.println(integer.compareTo(66));
        
//        double d1 = Double.NaN;
//        double d2 = Double.NaN;
//        double d3 = 88;
        
//        System.out.println(d1 > d3);
//        System.out.println(d1 < d3);
//        System.out.println(d1 != d3);
//        System.out.println(d1 == d3);
//        
//        System.out.println(d1 == d2);
//        System.out.println(d1 != d3);

//        System.out.println(Double.compare(d1, d3));
//        System.out.println(Double.compare(d1, d2));
//        System.out.println(Double.valueOf("88.33") *2);
        
//        Object o1 = 66; // new Integer(66)
//        
//        Double d4 = 55.9;
//        
//		Collection<Long> coll2 = new LinkedList<>();
//		
		
	}

}
