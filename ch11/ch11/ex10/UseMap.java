package ch11.ex10;
import static print.Print.*;
import java.util.*;
public class UseMap {
	public static void main(String args[]){
		 Map<Integer,String> m =new LinkedHashMap<Integer,String>();
         m.put(0,"dango");
         m.put(1, "yxt");
         m.put(2,"lxy");
         printf(m);
         printf(m.get(3));
         printf(m.containsKey(1));
         printf(m.containsValue("xyxt"));
         printf(m.keySet());
         printf(m.values());
         
         printf("Map的键和值都是STL;");  
         Map<List,Set> mm=new HashMap<List,Set>();
         List<Integer>  list=new LinkedList<Integer>(Arrays.asList(27,54,43));
         Set<String> set=new LinkedHashSet<String>(Arrays.asList("dango","yxt","lxy"));
         mm.put(list, set);
         printf(mm);
         printf(mm.keySet());
         printf(mm.values());
         for(List l:mm.keySet()){
             System.out.print(l+" has ");
             for(Set s:mm.values()){
            	 printf(s);
             }
         }
        
         printf("Map的键和值都是Map:");
         Map<Map,Map> m1=new HashMap<Map,Map> ();
         m1.put(m, mm);
         printf(m1);
	}   
}
