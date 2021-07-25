package jp.ac.nagasaki_u.ms.bb35319051.RPG.character;

import jp.ac.nagasaki_u.ms.bb35319051.RPG.position.Position;
import jp.ac.nagasaki_u.ms.bb35319051.RPG.status.Status;
public class Person extends Character{
	
	private Status first_status;
	
	
	public Person(){
		setName("noname");
		setPosition(null);
		setStatus(null);
		setState("fine");
		setNowStatus(null);
	}
	
	public Person(String name,Position position,Status status,String state){
		this.setName(name);
		setPosition(position);
		this.first_status=status;
		this.setStatus(position.getBuf().Buf(status));
		this.setState(state);
		this.setNowStatus(this.getStatus());
		count++;
		getCharList().add(this);
	}
	



	
	public void changePosition(Position po) {
		setPosition(po);
		setStatus(getPosition().getBuf().Buf(first_status));
	}

}
