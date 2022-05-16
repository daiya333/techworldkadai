package object;

public class Hero {
    private String name;
    int hp;
    private int op;
    
    public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException
			("–¼‘O‚ªNULL‚Å‚·");
		} else if (name.length() < 3 || name.length() > 10) {
			throw new IllegalArgumentException
			("–¼‘O‚Ì’·‚³‚ª•s“KØ‚Å‚·");
		} else {
		    this.name = name;
		}
	}
	
	public int getOp() {
		return this.op;
	}
	
	public void setOp(int op) {
		if (op < 0) {
			this.op = 0;
		} else {
		    this.op = op;
		}
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		if (hp < 0) {
			this.hp = 0;
		} else {
		    this.hp = hp;
		}
	}
    
    void attack(Monster mo) {
    	System.out.println(this.name + "‚ÌUŒ‚");
    	mo.hp -= this.op;
    	System.out.println("“G‚É" + this.op + "‚Ìƒ_ƒ[ƒW");
    	if (mo.hp > 0) {
    	    System.out.println("“G‚ÌHP‚Í" + mo.hp + "‚É‚È‚Á‚½");
    	} else {
    		System.out.println("“G‚ğ“|‚µ‚½");
    	}
    }
    
    void heal() {
    	System.out.println(this.name + "‚ª‘Ì—Í‚ğ‰ñ•œ‚µ‚½");
    	this.hp += 10;
    	System.out.println("‘Ì—Í‚ª" + this.hp + "‚É‚È‚Á‚½");
    }
}
