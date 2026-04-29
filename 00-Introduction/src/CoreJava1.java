
public class CoreJava1 {

	public static void main(String[] args) {
		
		// integer
		int num = 5;
		String website = "test text";
		char letter = 'G';
		double dec = 2.3;
		boolean result = true;
		
		System.out.println("My Number is " + num);
		
		//Arrays 
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		int[] arr2 = {1,2,3,4,5};
		
		String[] namesArr = {"grzegorz", "pawel", "john"};
		
		System.out.println(arr[3]);
		System.out.println(arr.equals(arr2));
		
		// loop
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		int index = 0; 
		while(index<namesArr.length){
			System.out.println(namesArr[index]);
			index++;
		}
		
		for(String s: namesArr) {
			System.out.println(s);
		}
		

	}

}
