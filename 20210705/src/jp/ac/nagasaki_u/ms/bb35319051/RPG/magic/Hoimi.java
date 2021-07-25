package jp.ac.nagasaki_u.ms.bb35319051.RPG.magic;

import jp.ac.nagasaki_u.ms.bb35319051.RPG.character.Character;
public class Hoimi extends Magic{
	
	public Hoimi() {
		super("Hoimi",3,0.1);
	}
	
	public Character effect(Character a,Character enemy) {
		enemy.setNowHP((int)(enemy.getNowHP()+(10+getPower()*a.getNowMagical())));
		a.setNowMP((int)(a.getNowMP()-getCost_MP()));
		System.out.println(enemy.getName()+"のHPを"+(10+getPower()*a.getNowMagical())+"回復");
		return a;
	}
}
