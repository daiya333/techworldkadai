package object;

public class EvolvedPokemon extends Pokemon {
    public void heal() {
	    System.out.println("�񕜂���");
    }
    
    public void twiceAttack() {
    	super.attack();
    	super.attack();
    }
}
