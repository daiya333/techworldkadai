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
		    System.out.println("�Ń_���[�W");
		    h.hp -= 10;
    	    m.hp -= 10;
    	    System.out.println("�E�҂�����" + 10 + "�̃_���[�W");
    	    System.out.println("�E�҂�HP��" + h.hp + "�ɂȂ���");
    	    System.out.println("���@�g����HP��" + m.hp + "�ɂȂ���");
		    poisonCount -= 1;	
		} else {
			System.out.println("�ł͎g���Ȃ�����");
		}
	}
}
