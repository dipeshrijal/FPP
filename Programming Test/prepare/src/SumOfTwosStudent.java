

/**
 * 
 * @author Xiaofei Huang
 *
 */
public class SumOfTwosStudent {
	//return sum of values in input array (values are 0 or 2), assuming already sorted
	public int sum(int[] arr) {
		if(arr.length == 0) return 0;
		return sumSection(arr, 0, arr.length-1);
	}
	
	private int sumSection(int[] arr, int lower, int upper) {
		int mid = (upper + lower)/2;
		if(lower == upper) return arr[lower];
		if(arr[mid] == 0) {
			return sumSection(arr, mid+1, upper);
		}
		else {
			return sumSection(arr, lower, mid) + 2 * (upper - mid);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {0, 0, 0, 0, 0, 0 , 0, 2, 2, 2, 2, 2};
		
		SumOfTwosStudent sot = new SumOfTwosStudent();
		System.out.println(sot.sum(arr));
	}
}
