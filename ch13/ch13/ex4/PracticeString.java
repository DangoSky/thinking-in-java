package ch13.ex4;
import static print.Print.*;
import java.util.*;

public class PracticeString {
	public static void main(String args[]){
		 String str="today is the first day when we are together";
		 String s="xyxt";
         printf(str.length());
         printf(str.charAt(3));
        
         char[] t=s.toCharArray();           //字符串转化为字符数组。
         System.out.println(t);                //使用printf则结果会不一样。
         String tem=String.valueOf(t);       //字符数组转化为字符串。
         printf(tem);
      // str.getChars(t,1);
         printf(tem.equals("Xyxt"));
         printf(tem.equalsIgnoreCase("Xyxt"));
         printf(tem.compareTo("xyxt"));
         printf(tem.contains("yxt"));
         printf(tem.contentEquals("xyxt"));
       //printf(tem.regionMatcher())
         printf(tem.startsWith("yxt"));
         printf(tem.endsWith("xy"));
         printf(tem.indexOf("y"));
         printf(tem.lastIndexOf("y"));      //没有从后往前开始计数。
         printf(str.substring(6));
         printf(str.subSequence(2,4));
         printf(str.concat("  "+tem));
         printf(tem.replace('x','z'));
         printf(str.toLowerCase());
         printf(str.toUpperCase());
         String q="  lxyyxt  ";
         printf(q);
         printf(q.trim());
         printf(str.intern());
         
         
         Formatter f=new Formatter(System.err);
         f.format("%s", "xyxt");
         
         
	}
     
      
}
