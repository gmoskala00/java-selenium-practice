package c00_introduction;
import java.util.List;

public class CoreJava3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String literal
		String s = "Grzegorz Moskala";
		String s1 = "Grzegorz Moskala";
		
		// new
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
		String[] arr = s.split(" ");
		System.out.println(arr[0]);
		
		s.trim();
		for(int i = 0; i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		
		
	}

}
