import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Training2 {

	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		names.add("Ira");
		names.add("Anton");
		names.add("Oleh");
		names.add("Mukola");
		names.add("Anna");
		
		for (String name : names) {
			System.out.println(name);
		}
	}
}
