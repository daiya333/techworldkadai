package object;

public class SuperHero extends Hero {
    public void twiceAttak(Monster mo){
		super.attack(mo);
    	super.attack(mo);
    }
}
