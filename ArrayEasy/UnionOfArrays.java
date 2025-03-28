package ArrayEasy;

import java.util.ArrayList;
import java.util.Arrays;

public class UnionOfArrays {

	 public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5}; 
		int arr2[] = {2,3,4,5,6};
		
		int n = arr1.length;
		int m = arr2.length;
		int[] ans = new int[10];
		int p1 = 0;
		int p2 = 0;
		for(int i=0; i < n; i++) {
			if(arr1[p1] == arr2[p2]) {
				ans[i] =arr1[p1];
				p1++;
				p2++;
			}else if(arr1[p1] < arr2[p2]) {
				ans[i] =arr1[p1];
				p1++;
			}else {
				ans[i] =arr2[p2];
				p2++;
			}
		}
		
		System.out.println(Arrays.toString(ans));

	}
}
