public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		InPut("WOW");
		InPut(3);
		InPut(3.14);
	} 
	
	public static void InPut(String h){
		System.out.println(h);
	}
	
	public static void InPut(double h){
		System.out.println(h);
	}
	
	public static void InPut(int k){
		System.out.println(k);
	}
	
	public static void InPut(bool k){
		if (k) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}