package jp.ac.nagasaki_u.ms.bb35319051.RPG.monster;

import jp.ac.nagasaki_u.ms.bb35319051.RPG.position.Position;
import jp.ac.nagasaki_u.ms.bb35319051.RPG.status.Buf_Status;
import jp.ac.nagasaki_u.ms.bb35319051.RPG.status.Status;

public class Monster extends Position  {
	private Status status;
	
	public Monster(String name,Status status) {
		super(name,new Buf_Status(1,1,1,1));
		setStatus(status);
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}


}
