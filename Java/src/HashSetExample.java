import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<Integer> hs= new HashSet<Integer>();
		
		hs.add(10);
		hs.add(10);
		hs.add(10);
		hs.add(10);
		
		System.out.println(hs);
	}

}
