package ArraysMedium;

import java.util.ArrayList;
import java.util.Arrays;


public class SortOneTwoarray {
	
	public static void main(String[] args) {
		int[] nums = {2,0,2,1,1,0};
		int n = nums.length;
		int cnt = 0;
		int cnt1 = 1;
		int cnt2 = 2; 
//		arrayList<Integer> ans = new arrayList<>(n);
//		for(int i=0; i < n; i++) {
//			if(nums[i] == cnt) {
//			ans.add(nums[i]);
//			}
//		}
//		
//		for(int i=0; i < n; i++) {
//			if(nums[i] == cnt1) {
//			ans.add(nums[i]);
//			}
//		}
//		
//		for(int i=0; i < n; i++) {
//			if(nums[i] == cnt2) {
//			ans.add(nums[i]);
//			}
//		}
//		
//		System.out.println(ans);
		
       //Optimal Approach		
		int low = 0, mid = 0, high = n - 1; // 3 pointers
		 ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
		 
        while (mid <= high) {
            if (arr.get(mid) == 0) {
                // swapping arr[low] and arr[mid]
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);

                low++;
                mid++;

            } else if (arr.get(mid) == 1) {
                mid++;

            } else {
                // swapping arr[mid] and arr[high]
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);

                high--;
            }
        }
        
        
        System.out.println(arr);
    }

     
 
		
		
		
		
	}

	
	


