
public class ArrayOccurance {
	
	static int check(String str, String word){
		String s = str;
		String[] r = s.split(" ");
		int i = 0;
		for (int j=0;j<r.length;j++){
			if (r[j].equalsIgnoreCase(word))
				i++;
		}
		
		return i;
	}
	
	public static void main(String[] args) {
		System.out.println("Number of occurence: " + check("Hello and and hello is what what is then go go well go","go"));
	}

}
