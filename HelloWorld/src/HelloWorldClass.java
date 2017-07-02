
public class HelloWorldClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hello World \n");
		String length = "This is a test string \n";
		
		System.out.print("The Length is:" + length.length() + "\n");
		
		String backwardsString = new StringBuffer(length).reverse().toString();
		System.out.print("Backwards:" + backwardsString);
		
	}

}
