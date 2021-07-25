package jp.ac.nagasaki_u.ms.bb35319051.RPG.magic;

import jp.ac.nagasaki_u.ms.bb35319051.RPG.character.Character;
public class Mela extends Magic{
	public Mela(){
		super("Mela",3,1.3);
	}
	public Character effect(Character a,Character enemy) {
		enemy.setNowHP((int)(enemy.getNowHP()-getPower()*a.getNowMagical()));
		a.getNowStatus().setMP((int)(a.getNowStatus().getMP()-getCost_MP()));
		System.out.println(enemy.getName()+"に"+(int)(getPower()*a.getNowMagical())+"ダメージ");
		return enemy;
	}
}
