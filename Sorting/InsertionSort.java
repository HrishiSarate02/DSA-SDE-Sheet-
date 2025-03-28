package Sorting;

public class InsertionSort {
	public static void main(String[] args) {
		 int[] arr = {9,6,7,4,2,1};
	        int n = arr.length;
	        int min;
	        for(int i = 0 ; i < n; i++){
	            int j = i;
	        while(j > 0 && arr[j-1] > arr[j]){
	                int temp = arr[j-1];
	                    arr[j-1] = arr[j];
	                    arr[j]  = temp;
	                    j--;
	            }
	         
	        }
	       for(int i=0; i < n; i++){
	           System.out.print(arr[i]);
	       }
	}

}
