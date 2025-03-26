package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountFreqOfElementAndSort {
	
	
	    public String frequencySort(String s) {
	        StringBuilder sb = new StringBuilder();
	        Map<Character,Integer> mp = new HashMap<>();
	        //counting frequency
	        for(char c : s.toCharArray()){
	            mp.put(c,mp.getOrDefault(c,0)+1);
	        }
	        
	        System.out.println(mp);

	        //sorting in descending order
	        List<Character> sortchar = new ArrayList<>(mp.keySet());
	        //sorting by Alphabets
	        sortchar.sort((a,b) -> a-b);
	        System.out.println(sortchar);
	        //sorting by frequency
	        sortchar.sort((a,b) -> mp.get(b) - mp.get(a));
	        System.out.println(sortchar);
	        

	        //add answer to string builder
	        for(char c : sortchar){
	            int count = mp.get(c);
	            for(int i=0 ; i < count ; i++){
	                sb.append(c);
	            }
	        } 
	        return sb.toString();

	    }
	
	    public static void main(String[] args) {
			String s = "jasklhfkjskdfhjfkdshkjla";
			CountFreqOfElementAndSort obj = new CountFreqOfElementAndSort();
			System.out.println(obj.frequencySort(s));  
			
		}

}
