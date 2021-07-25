package jp.ac.nagasaki_u.ms.bb35319051.RPG.character;

import jp.ac.nagasaki_u.ms.bb35319051.RPG.monster.Monster;
import jp.ac.nagasaki_u.ms.bb35319051.RPG.position.Position;

public class Enemy extends Character{
	
	public Enemy() {
		setName("NoName");
		setStatus(null);
		setState(null);
		setNowStatus(null);
	}
	
	public Enemy(Monster monster,String state) {
		setName(monster.getName());
		setPosition((Position)monster);
		setStatus(monster.getStatus());
		setState(state);
		setNowStatus(monster.getStatus());
		count++;
		getCharList().add(this);
	}
	

}
