package object;

public class SuperMagician extends Magician {
	
    public void superMagic(Monster mo) {
    	if (this.mp <= 0) {
    		System.out.println(this.name + "�͖��@���g����");
			System.out.println("mp������Ȃ�");
		} else
		    System.out.println(this.name + "�͖��@���g����");
		    mo.hp -= this.mp * 2;
		    System.out.println("�G��" + this.mp * 2 + "�̃_���[�W");
		    System.out.println("�G��HP��" + mo.hp + "�ɂȂ���");
		    this.mp -= 10 * 2;
        }
    
}

