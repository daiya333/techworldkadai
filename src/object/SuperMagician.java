package object;

public class SuperMagician extends Magician {
	
    public void superMagic(Monster mo) {
    	if (this.mp <= 0) {
    		System.out.println(this.name + "‚Í–‚–@‚ðŽg‚Á‚½");
			System.out.println("mp‚ª‘«‚è‚È‚¢");
		} else
		    System.out.println(this.name + "‚Í–‚–@‚ðŽg‚Á‚½");
		    mo.hp -= this.mp * 2;
		    System.out.println("“G‚É" + this.mp * 2 + "‚Ìƒ_ƒ[ƒW");
		    if (mo.hp > 0) {
		    	System.out.println("“G‚ÌHP‚Í" + mo.hp + "‚É‚È‚Á‚½");
		    } else {
		    	System.out.println("“G‚ð“|‚µ‚½");
		    }
		    if (this.mp > 0) {
		        this.mp -= 10 * 2;
		    } else {
		    	this.mp = 0;
		    }
        }
    
}

