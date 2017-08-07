

public class FiftiethLargest {
	public int fiftiethLargest(int[] arr) {
		int len = arr.length;
		int t = -1;
		for(int i = 0; i < 50; i++) {
			for(int j = i + 1; j < len; ++j) {
				if(arr[j] > arr[i]) {
					t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		return arr[49];
	}
	
	public static void main(String[] args) {
		int[] part1 = RandomPermutations.nextArray2(50);
		for(int k = 0; k < part1.length; ++k) {
			part1[k] = part1[k] + 17;
		}
		for(int i = 0; i < part1.length; ++i) {
			part1[i] = part1[i] + 10000;
		}
		int[] part2 = RandomPermutations.nextArray2(500);
		int[] test = new int[part1.length + part2.length];
		
		for(int i = 0; i < part2.length; ++i) {
			test[i] = part2[i];
		}
		for(int j = 0; j < part1.length; ++j) {
			test[j+part1.length] = part1[j];
		}
		FiftiethLargest fl = new FiftiethLargest();
		System.out.println("fiftieth largest should be 10017\nSolution: " + fl.fiftiethLargest(test));
	}
}
