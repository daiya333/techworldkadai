package object;

public class Story {
	private static final Magician Magician = null;
	private static final Hero Hero = null;

	public static void main(String[] args) {
		
		SuperHero h = new SuperHero();
		h.setName("ゆうた");
		System.out.println("勇者の名前は" + h.getName());
	    h.setHp(200);
		System.out.println("勇者のHPは" + h.getHp());
		h.setOp(10);
		System.out.println("勇者のOPは" + h.getOp());
		
		System.out.println("-------------------");
		System.out.println("-------------------");
		
		SuperMagician m = new SuperMagician();
		m.setName("しずか");
		System.out.println("魔法使いの名前は" + m.getName());
		m.setHp(100);
		System.out.println("魔法使いのHPは" + m.getHp());
		m.setMp(40);
		System.out.println("魔法使いのOPは" + m.getMp());
		
		System.out.println("-------------------");
		System.out.println("-------------------");
		
		SuperMonster mo = new SuperMonster();
		mo.setName("ドラゴン");
		System.out.println("魔物の名前は" + mo.getName());
		mo.setHp(500);
		System.out.println("魔物のHPは" + mo.getHp());
		mo.setOp(20);
		System.out.println("魔物のOPは" + mo.getOp());
		mo.setPc(1);
		System.out.println("毒を" + mo.getPc() + "回使える");
		
		System.out.println("-------------------");
		System.out.println("-------------------");
		
		while ((h.hp > 0 || m.hp > 0) && mo.hp > 0) {
		    if (h.hp > 0) {
		      h.twiceAttak(mo);
		      System.out.println("-------------------");
		    }
		    if (m.hp > 0) {
		      m.superMagic(mo);
		      System.out.println("-------------------");
		    }
		    if (mo.hp > 0) {
		      mo.poisonAttack(h, m);
		      System.out.println("-------------------");
		}
	   }
		 
	}
		
	}

