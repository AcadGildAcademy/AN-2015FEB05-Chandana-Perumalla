package chandana.assignment1.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class SortArray {
	ArrayList<Integer> AL;
	SortArray(){
		 AL = new ArrayList<Integer>();
	}
	
	void sort (){
		if(AL.isEmpty()){
			System.out.println("The array is empty. Please fill array");
		}
		else{
			Collections.sort(AL);
			System.out.println("array Size: "+AL.size()+"\nSorted Array:"+AL);
		}
	}
   void insertElement(int ele){
	   for(int a : AL){
		   if(a==ele){
			   System.out.println("Element already exists");
			   return;
		   }
	   }
	   AL.add(ele);
	   Collections.sort(AL);
	   System.out.println("Did not find "+ ele+ "\nWith "+ ele +" added array Size: "+AL.size()+"\nSorted Array:"+AL);
   }
}
