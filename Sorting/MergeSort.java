package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
	
	static int[] arr = {9, 6, 7, 4, 2,2,1, 1};
    static int n = arr.length;
    static int low = 0;
    static int high = n-1;
    
    static void merge( int[] arr, int low, int mid, int high) {
    	ArrayList<Integer> temp = new ArrayList<>();
    	int left = low;
    	int right = mid+1;
    	
    	while(left <= mid && right <= high) {
    		if(arr[left] <= arr[right]) {
    			temp.add(arr[left]);
    			left++;
    		}else {
    			temp.add(arr[right]);
    			right++;
    		}
    	}
    	
    	while(left <= mid) {
    		temp.add(arr[left]);
			left++;
    	}
    	
    	while(right <= high) {
    		temp.add(arr[right]);
			right++;
    	}
    	
    	  for(int i= low ; i <= high; i++){
	           arr[i] = temp.get(i - low);
	       }
    	  
    	  	
    }
    
    static void mergesort(int[] arr,int low,int high) {
    	if(low >= high) return;
    	int mid = (low + high) / 2;
    	mergesort(arr, low,  mid);
    	mergesort(arr,mid+1,high);
    	merge(arr,low,mid,high);
    	
    }
	
	
	
	
	public static void main(String[] args) {
		
		mergesort(arr,low,high);
		
		System.out.println(Arrays.toString(arr)); 
	}

}
