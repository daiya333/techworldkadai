package object;

public class Magician {
	protected String name;
	int hp;
	protected int mp;
	
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

	public int getMp() {
		return this.mp;
	}
	
	public void setMp(int mp) {
		if (mp < 0) {
			this.mp = 0;
		} else {
		    this.mp = mp;
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
	
	void magic(Monster mo) {
		if (this.mp <= 0) {
			System.out.println("mpが足りない");
		}
		System.out.println(this.name + "は魔法を使った");
		mo.hp -= this.mp;
		System.out.println("敵に" + this.mp + "のダメージ");
		if (mo.hp > 0) {
			System.out.println("敵のHPは" + mo.hp + "になった");
		} else {
			System.out.println("敵を倒した");
		}
		if (this.mp > 0) {
		    this.mp -= 10 * 2;
		} else {
		    this.mp = 0;
		}
		
	}
	
	void heal() {
		System.out.println(this.name + "が体力を回復した");
    	this.hp += 10;
    	System.out.println("体力が" + this.hp + "になった");
	}

}
