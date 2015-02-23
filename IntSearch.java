
public class IntSearch {
	static int findPosition(int num, int nums[]){
		int position = 0;
		for (int i = 0; i < nums.length; i++){
			if(nums[i] == num){
				position = i;
				break;
			}
			else{
				position = -1;
			}
		}
		return position;
	}
	public static void main (String[] args){
		int numbers[] = {1,2,3,4,5,6,7,8,9};
		int location = findPosition(0, numbers);
		if(location != -1){
			System.out.println("Number is at " + location + "th position in array");
		}
		else{
			System.out.println("Number is not available in array");
		}
	}
}
