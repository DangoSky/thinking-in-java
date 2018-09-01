//½Ó¿Ú
package ch9.ex5;
import static print.Print.*;

interface Monster{
	 void menace();
}
interface DangerousMonster extends Monster{
	void destroy();
}
interface Lethal{
	void kill();
}
class DragonZilla implements DangerousMonster{
	public void menace(){
		printf("DragonZilla's menace");
	}
	public void destroy(){
		printf("DragonZilla's destroy");
	}
}
interface Vampire extends DangerousMonster, Lethal{
	void drinkBlood();
}
class VeryBadVampire implements Vampire{
	public void menace(){
		printf("VeryBadVampire's menace");
	}
	public void destroy(){
		printf("VeryBadVampire's destroy");
	}
	public void kill(){
		printf("VeryBadVampire's kill");
	}
	public void drinkBlood(){
		printf("VeryBadVampire's drinkBlood");
	}
}

public class HorrorShow {
	static void u(Monster b){
		b.menace();
	}
	static void v(DangerousMonster d){
		d.menace();
		d.destroy();
	}
    static void w(Lethal l){
    	l.kill();
    }
    public static void main(String args[]){
    	DangerousMonster barney=new DragonZilla();
    	u(barney);
    	v(barney);
    	
    	Vampire vlad=new VeryBadVampire();
    	u(vlad);
    	v(vlad);
    	w(vlad);
    }
}
