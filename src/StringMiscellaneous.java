
public class StringMiscellaneous {

	public static void main(String[] args) {
		String string = "Hello";
		char[] charArray = new char[5];
		
		System.out.printf("%nstring: %s", string);
		
		System.out.printf("%nstring length is: %d%n", string.length());
		
		for(int count = 0; count <= string.length()-1; count++) { //hello the correct way from 0 to the length
			/*it is also possible to write the for as for(int count = 0; count < string.length(); count++)
			remember length is not the same as amount of elements - 
			this is similar to an array in this case for using .length for String.*/
			System.out.printf("%ncharAt: %c%n", string.charAt(count));
		}
		
		string.getChars(0, 5, charArray, 0);
		
		for (char character: charArray) {
			System.out.print(character);
		}

		System.out.println();
	}

}
