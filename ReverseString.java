
public class ReverseString {
	
	static String makeReverse (String str){
		String reversedString = "";
		
		for (int i = str.length() - 1; i >= 0; i--){
			reversedString = reversedString + str.charAt(i);
		}
		
		return reversedString;
		
	}
	public static void main (String[] args){
		System.out.println(makeReverse("Hello my name is Danial"));
	}
}
