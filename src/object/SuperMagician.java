package object;

public class SuperMagician extends Magician {
	
    public void superMagic(Monster mo) {
    	if (this.mp <= 0) {
    		System.out.println(this.name + "は魔法を使った");
			System.out.println("mpが足りない");
		} else
		    System.out.println(this.name + "は魔法を使った");
		    mo.hp -= this.mp * 2;
		    System.out.println("敵に" + this.mp * 2 + "のダメージ");
		    System.out.println("敵のHPは" + mo.hp + "になった");
		    this.mp -= 10 * 2;
        }
    
}

