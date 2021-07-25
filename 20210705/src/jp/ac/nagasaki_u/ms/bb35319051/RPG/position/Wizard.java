package jp.ac.nagasaki_u.ms.bb35319051.RPG.position;

import jp.ac.nagasaki_u.ms.bb35319051.RPG.magic.Biquilt;
import jp.ac.nagasaki_u.ms.bb35319051.RPG.magic.Mela;
import jp.ac.nagasaki_u.ms.bb35319051.RPG.status.Buf_Status;

public class Wizard extends Position{
	public Wizard() {
		super("Wizard",new Buf_Status(0.5,1.0,1.5,1.3));
		setMagic(new Mela());
		setMagic(new Biquilt());
	}
}
