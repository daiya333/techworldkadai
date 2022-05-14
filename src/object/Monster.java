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

	void attack(Hero h, Magician m) {
    	System.out.println(this.name + "�̍U��");
    	h.hp -= this.op;
    	m.hp -= this.op;
    	System.out.println("�E�҂�����" + this.op + "�̃_���[�W");
    	if (h.hp > 0) {
    	    System.out.println("�E�҂�HP��" + h.hp + "�ɂȂ���");
    	} else {
    		System.out.println("�E�҂͓|�ꂽ");
    	}
    	if (m.hp > 0) {
    		System.out.println("���@�g����HP��" + m.hp + "�ɂȂ���");
    	} else {
    		System.out.println("���@�g���͓|�ꂽ");
    	}
    }
}
