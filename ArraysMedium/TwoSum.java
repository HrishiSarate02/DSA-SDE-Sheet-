package ArraysMedium;

public class TwoSum {
	
	
	public static void main(String[] args) {
		
		 int n = 5;
		    int arr[] = {2,6,5,8,11};
			int target = 14;
			int n1 = 0;
			int n2 = 0;
		//BruteForce Approach
//			for(int i=0; i < N; i++) {
//				for(int j=1; j < N;j++) {
//					if(arr[i]+ arr[j] == target) {
//						n1 = i;
//					    n2 = j;
//					}
//				}
//			}
//			
//			System.out.println(n2+"  "+n1);
//	}
	   
		//Optimal approach
		int left = 0;
		int right = n-1;
		while(left < right) {
			int sum = arr[left] + arr[right];
			if(sum == target){
				n1= left;
				n2= right;
				break;
			}else if(sum < target ){
				left++;
			}else right--;
		}
		System.out.println(n1+" "+n2);		
	}
}
