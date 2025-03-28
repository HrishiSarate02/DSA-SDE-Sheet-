package ArraysMedium;

import java.util.*;
public class MajorityElementThatOccurs {
	
	public static void main(String[] args) {
		int n = 10;
		int arr[] = {4,4,2,4,3,4,4,3,2,4,1,1};
		int maxlen = 0;
		int ans = 0;
//		for(int i=0;  i< n; i++) {
//			int cnt=0;
//			for(int j=0; j<n;j++) {
//				if(arr[i] == arr[j] ) {
//					cnt++;
//				}
//			}
//			 maxlen = Math.max(maxlen, cnt + 1);
//			 if(maxlen > cnt) {
//			ans=arr[i];
//			 }
//		}
//		System.out.println(ans);
//	}
		
		//Better Approach
//		HashMap<Integer,Integer> map = new HashMap<>();
//		
//		for(int i=0; i < n;i++) {	
//		map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
//			
//		}
//		System.out.println(map);
//		for(Map.Entry<Integer, Integer> k : map.entrySet()) {
//			if(k.getValue() > n/2) {
//				System.out.println(k.getKey());
//			}
//		}
		
		//Optimal Approach -----------Moore's Voting Algorithm
		int cnt = 0;
		int el=0;
		for(int i=0; i<n; i++ ) {
			
			if(cnt == 0) {
				el = arr[i];
				cnt= 1;
			}else if(el == arr[i]) {
				cnt++;
			}else {
				cnt--;
			}
		}
		System.out.println(cnt);
		int cnt1=0;
		for(int i=0; i < n; i++) {
			if(arr[i]==el) cnt1++;
		}
		
		if(cnt1 > (n/2)) System.out.println(el);
		
	}
}
