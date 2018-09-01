package ch10.ex6;

//匿名内部类
import static print.Print.*;
public class Parcel7 {
	
	public class Wrapping{
	     private int i;
	     public Wrapping(int x){i=x;}
	     public int value(){return i;}
	     //void show() { printf("Wrapping class");}
   }
	
     public Wrapping wrapping(int x){      
    	 return new Wrapping(x){
    		 public void show() {printf("wrapping method");}
    		 public int value(){
    			 return super.value()*47;     //该匿名内部类是Wrapping类的派生类
    		 }
    	 };
     }
     public static void main(String args[]){
    	 Parcel7 p=new Parcel7();
    	 Wrapping w=p.wrapping(10);
    	 int t=w.value();
    	
    	 printf(t);
    	 //w.show();
     }
}
