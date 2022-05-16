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
			("���O��NULL�ł�");
		} else if (name.length() < 3 || name.length() > 10) {
			throw new IllegalArgumentException
			("���O�̒������s�K�؂ł�");
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
			System.out.println("mp������Ȃ�");
		}
		System.out.println(this.name + "�͖��@���g����");
		mo.hp -= this.mp;
		System.out.println("�G��" + this.mp + "�̃_���[�W");
		if (mo.hp > 0) {
			System.out.println("�G��HP��" + mo.hp + "�ɂȂ���");
		} else {
			System.out.println("�G��|����");
		}
		if (this.mp > 0) {
		    this.mp -= 10 * 2;
		} else {
		    this.mp = 0;
		}
		
	}
	
	void heal() {
		System.out.println(this.name + "���̗͂��񕜂���");
    	this.hp += 10;
    	System.out.println("�̗͂�" + this.hp + "�ɂȂ���");
	}

}
