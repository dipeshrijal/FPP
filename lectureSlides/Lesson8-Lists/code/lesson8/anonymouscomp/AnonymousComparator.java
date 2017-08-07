package lesson8.anonymouscomp;

import java.util.Arrays;
import java.util.Comparator;

public class AnonymousComparator {
	
	public static void main(String[] args) {
		sortingWithAnonymousComparator(new String[] {"Tom", "Jerry", "Alan", "Anna"});
	}
	private static void sortingWithAnonymousComparator(String[] arr) {
		System.out.println("Array before sorting: " + Arrays.toString(arr));
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) {
				s1 = Util.reverse(s1);
				s2 = Util.reverse(s2);
				return s1.compareTo(s2);
			}
		});
		System.out.println("Array after sorting: " + Arrays.toString(arr));
	}
}
