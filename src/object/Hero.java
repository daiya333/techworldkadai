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
			("���O��NULL�ł�");
		} else if (name.length() < 3 || name.length() > 10) {
			throw new IllegalArgumentException
			("���O�̒������s�K�؂ł�");
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
    	System.out.println(this.name + "�̍U��");
    	mo.hp -= this.op;
    	System.out.println("�G��" + this.op + "�̃_���[�W");
    	System.out.println("�G��HP��" + mo.hp + "�ɂȂ���");
    }
    
    void heal() {
    	System.out.println(this.name + "���̗͂��񕜂���");
    	this.hp += 10;
    	System.out.println("�̗͂�" + this.hp + "�ɂȂ���");
    }
}
