package ch13.ex4;
import static print.Print.*;
import java.util.*;

public class PracticeString {
	public static void main(String args[]){
		 String str="today is the first day when we are together";
		 String s="xyxt";
         printf(str.length());
         printf(str.charAt(3));
        
         char[] t=s.toCharArray();           //�ַ���ת��Ϊ�ַ����顣
         System.out.println(t);                //ʹ��printf�����᲻һ����
         String tem=String.valueOf(t);       //�ַ�����ת��Ϊ�ַ�����
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
         printf(tem.lastIndexOf("y"));      //û�дӺ���ǰ��ʼ������
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
