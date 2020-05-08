
public class StringMiscellaneous {

	public static void main(String[] args) {
		String string = "Hello";
		char[] charArray = new char[5];
		
		System.out.printf("%nstring: %s", string);
		
		System.out.printf("%nstring length is: %d%n", string.length());
		
		for(int count = string.length()-1; count >= 0; count--) {
			System.out.printf("%ncharAt: %c%n", string.charAt(count));
		}
		
		string.getChars(0, 5, charArray, 0);
		
		for (char character: charArray) {
			System.out.print(character);
		}

		System.out.println();
	}

}
