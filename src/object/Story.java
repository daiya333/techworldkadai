package object;

public class Story {
	private static final Magician Magician = null;
	private static final Hero Hero = null;

	public static void main(String[] args) {
		
		SuperHero h = new SuperHero();
		h.setName("�䂤��");
		System.out.println("�E�҂̖��O��" + h.getName());
	    h.setHp(100);
		System.out.println("�E�҂�HP��" + h.getHp());
		h.setOp(10);
		System.out.println("�E�҂�OP��" + h.getOp());
		
		System.out.println("-------------------");
		System.out.println("-------------------");
		
		SuperMagician m = new SuperMagician();
		m.setName("������");
		System.out.println("���@�g���̖��O��" + m.getName());
		m.setHp(100);
		System.out.println("���@�g����HP��" + m.getHp());
		m.setMp(20);
		System.out.println("���@�g����OP��" + m.getMp());
		
		System.out.println("-------------------");
		System.out.println("-------------------");
		
		SuperMonster mo = new SuperMonster();
		mo.setName("�h���S��");
		System.out.println("�����̖��O��" + mo.getName());
		mo.setHp(400);
		System.out.println("������HP��" + mo.getHp());
		mo.setOp(50);
		System.out.println("������OP��" + mo.getOp());
		mo.setPc(1);
		System.out.println("�ł�" + mo.getPc() + "��g����");
		
		System.out.println("-------------------");
		System.out.println("-------------------");
		
		h.twiceAttak(mo);
		System.out.println("-------------------");
		
		m.superMagic(mo);
		System.out.println("-------------------");
		
		m.superMagic(mo);
		System.out.println("-------------------");
		
		mo.poisonAttack(h, m);
		System.out.println("-------------------");
		
		mo.poisonAttack(h, m);
		System.out.println("-------------------");
		
	}
}