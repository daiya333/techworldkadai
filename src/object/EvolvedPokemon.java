package object;

public class EvolvedPokemon extends Pokemon {
    public void heal() {
	    System.out.println("‰ñ•œ‚µ‚½");
    }
    
    public void twiceAttack() {
    	super.attack();
    	super.attack();
    }
}
