package jp.ac.nagasaki_u.ms.bb35319051.RPG.monster;

import jp.ac.nagasaki_u.ms.bb35319051.RPG.magic.Mela;
import jp.ac.nagasaki_u.ms.bb35319051.RPG.status.Status;

public class Slime extends Monster {
	public Slime() {
		super("Slime",new Status(5,20,20,5));
		setMagic(new Mela());
	}
}
