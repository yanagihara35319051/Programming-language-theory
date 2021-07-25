package jp.ac.nagasaki_u.ms.bb35319051.RPG.position;

import jp.ac.nagasaki_u.ms.bb35319051.RPG.magic.Hoimi;
import jp.ac.nagasaki_u.ms.bb35319051.RPG.status.Buf_Status;

public class Priest extends Position{
	public Priest() {
		super("Priest",new Buf_Status(0.5,1.0,1.5,1.3));
		setMagic(new Hoimi());
	}
}
