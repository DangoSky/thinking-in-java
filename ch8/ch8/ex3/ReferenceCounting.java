package ch8.ex3;

//import static print.Print.*;

class Shared {
	private int refcount=0;
	private static int counter=0;
	private final int id=counter++;
	public  Shared(){
		System.out.println("Creating "+this);
	}
	public void addRef(){
		refcount++;
	}
	protected void dispose(){
		if(--refcount==0){
			System.out.println("Disposing "+this);
		}
	}
	public String toString(){
		return "Shared "+id;
	}
	public int show(){
		return refcount;
	}
}
class Composing{
	private Shared shared;
	private static int counter=0;
	private final int id=counter++;
	public Composing(Shared shared){
		System.out.print("Creating "+this);
		this.shared=shared;
		this.shared.addRef();
		System.out.println(" refcount="+this.shared.show());
	}
	protected void dispose(){
		System.out.println("dispose "+this);
		shared.dispose();
	}
	public String toString(){
		return "Composing "+id;
	}
}
public class ReferenceCounting{
	public static void main(String args[]){
		Shared shared=new Shared();
		Composing[] composing={new Composing(shared),new Composing(shared),new Composing(shared),new Composing(shared),new Composing(shared)};
	   for(Composing s:composing){
		   s.dispose();
	   }
	}
	
}