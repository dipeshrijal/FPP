

import java.util.Arrays;

public class SumOfTwos {

	//A is sorted array of 0s and 2s
	public static int findSum(int[] A) {
		
		if(A.length == 0) {
			return 0;
		}
		else if(A[0] == 2) { //must be all 1s since sorted
			return 2 * A.length;
		}
		else if(A[A.length-1] == 0) { //must all be 0s
			return 0;
		}
		int pos = position(A, 0, A.length-1);
		return 2 * (A.length - pos);
	}
	private static int position(int[] A,int lower, int upper) {
		
		int[] retval = new int[2];
		int mid = (upper + lower)/2;
		if(A[mid] == 0 && A[mid + 1] == 2) {
				return mid + 1;
		}
		if(A[mid] == 0 && A[mid+1] == 0) {
			return position(A, mid+1, upper);                                
		}
		if (A[mid] == 2) {
			return position(A, lower, mid -1);                                
		}
		return 0;
	}
	
	public static void main(String[] args) {
		int[] test1 = {1,0,0,2,2,2,7};
		System.out.println(findSum(test1));
	}

}
