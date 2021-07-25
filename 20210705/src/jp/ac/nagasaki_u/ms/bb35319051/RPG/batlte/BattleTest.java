package jp.ac.nagasaki_u.ms.bb35319051.RPG.batlte;

import jp.ac.nagasaki_u.ms.bb35319051.RPG.character.Enemy;
import jp.ac.nagasaki_u.ms.bb35319051.RPG.character.Person;
import jp.ac.nagasaki_u.ms.bb35319051.RPG.monster.Slime;
import jp.ac.nagasaki_u.ms.bb35319051.RPG.position.Wizard;
import jp.ac.nagasaki_u.ms.bb35319051.RPG.status.Status;

public  class BattleTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person person1=new Person("健吾",new Wizard(),new Status(5,50,50,5),"fine");
		Enemy enemy1=new Enemy(new Slime(),"fine");
		Battle battle=new Battle(person1,enemy1);
		battle.battle();
		return;
	}

}
