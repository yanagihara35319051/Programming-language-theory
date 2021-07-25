package jp.ac.nagasaki_u.ms.bb35319051.RPG.character;


import jp.ac.nagasaki_u.ms.bb35319051.RPG.monster.Monster;
import jp.ac.nagasaki_u.ms.bb35319051.RPG.monster.Slime;
import jp.ac.nagasaki_u.ms.bb35319051.RPG.position.Priest;
import jp.ac.nagasaki_u.ms.bb35319051.RPG.position.Warrior;
import jp.ac.nagasaki_u.ms.bb35319051.RPG.position.Wizard;
import jp.ac.nagasaki_u.ms.bb35319051.RPG.status.Status;
public class PersonTest {

	public static void main(String[] args) {
		
		Person person1=new Person("Kengo",new Warrior(),new Status(5,5,5,5),"fine");
		Person person2=	new Person("okino",new Wizard(),new Status(5,5,5,5),"fine");
		Person person3=	new Person("A",new Priest(),new Status(5,5,5,5),"fine");
		Enemy enemy1=new Enemy((Monster)(new Slime()),"fine");
		enemy1.print();
		person2.UseMagic("Mela", enemy1);
		System.out.println(" ");
		enemy1.print();
		person2.print();
	}

}
