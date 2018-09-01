package ch10.ex5;
//定义在方法中的内部类
@SuppressWarnings("all")
public class Parcel6 {
	private void internalTracking(boolean b){
		if(b){
			class TrackingSlip{
				private String id;
				TrackingSlip(String s){
					id=s;
				}
				String getSlip(){
					return id;
				}
			}	
		}
		//TrackingSlip ts=new TrackingSlip("slip");   //error作用域外不可用
	   //	String  s=ts.getSlip();
	}
   public void track(){
	   internalTracking(true);
   }
   public static void main(String args[]){
	   Parcel6 p=new Parcel6();
	   p.track();
   }
}
