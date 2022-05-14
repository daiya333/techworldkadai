package object;

public class SuperMonster extends Monster {
	
	private int poisonCount;
	
	public void setPc(int poisonCount) {
		if (poisonCount < 0) {
			this.poisonCount = 0;
		} else {
		    this.poisonCount = poisonCount;
		}
	}
	
	public int getPc() {
		return this.poisonCount;
	}
	
	
	
	public void poisonAttack(Hero h, Magician m){
		super.attack(h, m);
		if (poisonCount > 0) {
		    System.out.println("毒ダメージ");
		    h.hp -= 10;
    	    m.hp -= 10;
    	    System.out.println("勇者たちに" + 10 + "のダメージ");
    	    System.out.println("勇者のHPは" + h.hp + "になった");
    	    System.out.println("魔法使いのHPは" + m.hp + "になった");
		    poisonCount -= 1;	
		} else {
			System.out.println("毒は使えなかった");
		}
	}
}
