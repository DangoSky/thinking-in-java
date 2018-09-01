package ch11.ex3;
import java.util.*;
import static print.Print.*;

public class AddingGroups {
      public static void main(String args[]){
    	printf("STL的熟练使用:") ;
    	  Collection<Integer> collection=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));  
    	  printf(collection);
    	  collection.add(21);
    	  printf(collection.contains(21));
    	  collection.remove(21);
    	  printf(collection.contains(21));
    	 //int  tem=collection.get(1);           //Collection不能使用.get和.indexOf方法,List可以。
    	 //printf(collection.indexOf(2));
    	  printf(collection);
    	  Integer[] moreInts={6,7,8,9,10};   	  
    	  collection.addAll(Arrays.asList(moreInts)); 
    	  printf(collection);
    	  
    	  Collections.addAll(collection,11,12,13,14,15);	  
    	  Collections.addAll(collection,moreInts);
    	  printf(collection);
    	 
	  
    	 // List<Integer> list=Arrays.asList(16,17,18,19,20);
    	 List<Integer> list=new ArrayList<Integer>(Arrays.asList(27,54)); 	 
    	 //  list.remove(1);
    	 printf(list);
    	 int t=list.get(1);
    	 printf(t);
    	 printf(list.indexOf(20));	  
    	 List<Integer> sub=list.subList(0,1);
    	 sub.add(43); 
    	 printf(sub);
    	 printf(list);
    	 list.addAll(sub);
    	 printf(list);
    	 printf(list.contains(43));    
    	 
    	 list.retainAll(sub);
    	 printf(list);
    	// Object[] a=list.toArray();
    	
    	     
    	  
      }

}
