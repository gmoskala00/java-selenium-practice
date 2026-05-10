package c00_introduction;

public class MethodsDemo {

	public static void main(String[] args) {
		
		MethodsDemo d = new MethodsDemo();
		String data = d.getData();
		System.out.println(data);
		
		MethodsDemo2 d2 = new MethodsDemo2();
		String data2 = d2.getUserData();
		System.out.println(data2);
		
		getData2();

	}
	
	public String getData() {
		System.out.println("Method data");
		return "Grzegorz";
	}
	
	public static String getData2() {
		System.out.println("Method data 2");
		return "Grzegorz 2";
	}

}
