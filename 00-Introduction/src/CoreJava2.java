import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJava2 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5, 32,331,55,62};
		
		for(int number: arr) {
			if(number%2==0) {
				System.out.println(number);
			}
			else {
				System.out.println("Not even: " + number);
			}
		}
		
		ArrayList<Integer> dynamicArr = new ArrayList<Integer>();
		dynamicArr.add(3);
		dynamicArr.add(32);
		dynamicArr.add(11);
		System.out.println(dynamicArr);
		
		ArrayList<String> dynamicArr2 = new ArrayList<String>();
		dynamicArr2.add("grzegorz");
		dynamicArr2.add("john");
		dynamicArr2.add("paul");
		System.out.println(dynamicArr2.get(2));
		
		for(int i = 0; i<dynamicArr2.size();i++) {
			System.out.println(dynamicArr2.get(i));
		}
		
		for(String val: dynamicArr2) {
			System.out.println(val);
		}
		
		System.out.println(dynamicArr2.contains("grzegorz"));
		
		String[] namesArr = {"grzegorz", "pawel", "john"};
		
		List<String> convertedArr = Arrays.asList(namesArr);
		convertedArr.contains("grzegorz");
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(123);

	}
	
	public static void excercise() {
		 int[] numbers = {1,2,3,4,5};
		 System.out.println(numbers[0]);
		 System.out.println(numbers[numbers.length - 1]);
		 
		 for(int i=numbers.length-1;i>=0;i--){
		     System.out.println(numbers[i]);
		 }
		 int sum = 0;
		 for(int number: numbers){
		     sum += number;
		 }
		 System.out.println(sum);
		}



}

