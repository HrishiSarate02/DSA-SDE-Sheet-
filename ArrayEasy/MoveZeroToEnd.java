package ArrayEasy;

import java.util.Arrays;

public class MoveZeroToEnd {
	
	public static void main(String[] args) {
		int[] arr = { 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
		int n = arr.length;
		

//for(int i = 0; i < n; i++) {
//	if(arr[i] == 0) {
//		int temp = arr[j-1] ;
//		arr[j-1] = 	arr[i];
//		arr[i] = temp;
//		
//	}
//}
for(int i =0;i<n;i++){
    if(arr[i]==0){
        for(int j=i;j<n-1;j++){
            arr[j]=arr[j+1];
        }
        arr[n-1]=0;
    }
		
System.out.println(Arrays.toString(arr));
	}

	}
}
