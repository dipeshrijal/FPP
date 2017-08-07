

import java.util.Arrays;

public class SelfAware {
	static int[] arr;
	public static void printSelfAwareArrs(int n) {
		arr = new int[n];
		runSelfAwarePrint(0);
	}
	public static void runSelfAwarePrint(int pos) {
		if(pos == arr.length) {
			if(isSelfAware(arr)) {
				System.out.print("-> ");
				for(int number: arr) {
					System.out.print(number + " ");
				}
				System.out.println();
			}
			return;
		}
		//increments values in arr slots one at a time
		for(int i = 0; i < arr.length; ++i) {
			arr[pos] = i;
			//System.out.println(Arrays.toString(arr));
			//checks whether current value of arr is self-aware
			runSelfAwarePrint(pos+1);
			
		}
	}
	
	public static boolean isSelfAware(int[] arr) {
		if(arr==null) return false;
		if(arr.length == 0) return true;
		int n = arr.length;
		for(int i = 0; i < n; ++i) {
			int count=0;
			for(int j = 0; j < n; ++j) {
				if(arr[j] == i) ++count;
			}
			if(count != arr[i]) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		printSelfAwareArrs(4);
	}
	
}
