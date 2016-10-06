//Basic Array & ArrayList operations

package Arrays;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		//Initialize array
		int[] int1 = new int[5]; //Size must be specified!!
		
		//Adding elements 
		for (int i=0; i<int1.length ; i++){
			int1[i] = i;
			System.out.println("Added: " +int1[i]);
		}
		
		//Random Access O(1)
		System.out.println(int1[4]);
		
		//Linear Search O(N)
		//Retrieve index of element 
		for (int i=0;i<int1.length;i++){
			if(int1[i] == 3){
				System.out.println("Index found: "+i);
			}
		}
		
		//ArrayLists
		List<String> list1 = new ArrayList<String>();
		
		list1.add("Str1");
		list1.add("Str2");
		list1.add("Str3");
		
		//Print list
		for(String s:list1){
			System.out.println(s);
		}
		
		//Insert at index
		list1.add(2, "NewStr");
		
		for(String s:list1){
			System.out.println(s);
		}
		
		//Check for elements .contains()
		System.out.println(list1.contains("Str1"));
	}
}

