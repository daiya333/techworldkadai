package object;

public class Monster {
	private String name;
    int hp;
    private int op;
    
    public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException
			("名前がNULLです");
		} else if (name.length() < 3 || name.length() > 10) {
			throw new IllegalArgumentException
			("名前の長さが不適切です");
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

	void attack(Hero h, Magician m) {
    	System.out.println(this.name + "の攻撃");
    	h.hp -= this.op;
    	m.hp -= this.op;
    	System.out.println("勇者たちに" + this.op + "のダメージ");
    	if (h.hp > 0) {
    	    System.out.println("勇者のHPは" + h.hp + "になった");
    	} else {
    		System.out.println("勇者は倒れた");
    	}
    	if (m.hp > 0) {
    		System.out.println("魔法使いのHPは" + m.hp + "になった");
    	} else {
    		System.out.println("魔法使いは倒れた");
    	}
    }
}
