package ch11.ex6;
import java.util.*;
public class Iteration {
     public static void main(String args[]){
         System.out.println("List的iterator：");
    	 List<Integer> list=new ArrayList<Integer> (Arrays.asList(1,2,3,4,5));
    	 Iterator<Integer> it=list.iterator();
    	 System.out.println(list);
      // System.out.println(it);
    	 while(it.hasNext()){
    		 Integer t=it.next();           //也可以是int t；
    		 System.out.println(t);
    		 it.remove();
    	 }
    	 for(int tem:list){
    		 System.out.println(tem);
    	 }
    	 
    	 System.out.println("Set的iterator："); 
    	 Collection<Double> collection=new HashSet<Double>(Arrays.asList(6.6,7.7,8.8,9.9,10.0,6.6));
    	 Iterator<Double> SetIt=collection.iterator();	
    	 while(SetIt.hasNext()){
    		 System.out.println(SetIt.next());
    	 }
    	 
    	 System.out.println("List的ListIterator：");
    	 List<String> list1=new LinkedList<String>(Arrays.asList("lxy","yxt"));
    	 ListIterator<String>  it1=list1.listIterator();
    	 System.out.println(list1);
    	
    	 while(it1.hasNext()){
    		// System.out.print(it1.previousIndex());
    		// System.out.print(it1.nextIndex());
    		 System.out.println(it1.next());	
    		// System.out.println(it1.previous());   		
    		
    	 }
    	
     }
	
}
