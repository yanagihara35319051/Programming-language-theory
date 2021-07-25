package jp.ac.nagasaki_u.ms.bb35319051.RPG.magic;

import jp.ac.nagasaki_u.ms.bb35319051.RPG.character.Character;

public class Biquilt extends Magic {

	public Biquilt() {
		super("biquilt",5,1.5);
	}



	@Override
	public Character effect(Character a, Character enemy) {
		enemy.setNowAtack((int)(enemy.getNowAtack()*getPower()));
		a.setNowMP((int)(a.getNowMP()-getCost_MP()));
		System.out.println(a.getName()+"の攻撃力があがった！");
		return enemy;
	}

}
