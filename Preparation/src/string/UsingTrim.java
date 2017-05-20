package string;
public class UsingTrim {
	public static void main(String[] args) {
		String input="   welcome   ";
		System.out.println(input);
		System.out.println("Length of the String is:"+" "+input.length());
		String trim=input.trim();
		System.out.println("after trim");
		System.out.println("Length of the String is:"+" "+trim.length());
		
		
	}

}
