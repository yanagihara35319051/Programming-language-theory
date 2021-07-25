package jp.ac.nagasaki_u.ms.bb35319051.RPG.position;

import java.util.ArrayList;

import jp.ac.nagasaki_u.ms.bb35319051.RPG.character.Character;
import jp.ac.nagasaki_u.ms.bb35319051.RPG.magic.InterfaceMagicList;
import jp.ac.nagasaki_u.ms.bb35319051.RPG.magic.Magic;
import jp.ac.nagasaki_u.ms.bb35319051.RPG.magic.Magiclist;
import jp.ac.nagasaki_u.ms.bb35319051.RPG.status.Buf_Status;

public abstract class Position implements InterfaceMagicList{
	
	private String name ;
	private Buf_Status buf;
	private Magiclist MagicList = new Magiclist(); 
	
	public Position(){
		setName("NoName");
		setBuf(null);
	}
	
	public Position(String name,Buf_Status buf){
		this.setName(name);
		this.setBuf(buf);
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Buf_Status getBuf() {
		return buf;
	}

	public void setBuf(Buf_Status buf) {
		this.buf = buf;
	}

	public void setMagic(Magic magic) {
		MagicList.setMagic(magic);
	}

	public ArrayList<Magic> getMagicList() {
		return MagicList.getMagicList();
	}

	public void setMagicList(ArrayList<Magic> magicList) {
		MagicList.setMagicList(magicList);
	}

	public void print() {
		System.out.println(getName());
		System.out.println("using magic:");
		for(int j=0;j<getMagicList().size();j++) {
			getMagicList().get(j).print();
		}
	}
	
	public Character selectMagic(Character me,Character enemy) {
		return MagicList.selectMagic(me, enemy);
	}

	
	public void printMagicList() {
		MagicList.printMagicList();
	}
	
	public Magic searchMagic(String nam) {
		return MagicList.searchMagic(nam);
		
	}
	
	public String searchNameIndex(int i) {
		return MagicList.searchNameIndex(i);
	}
	public Character UseMagic(String na,Character me,Character a) {
		return MagicList.UseMagic(na,me,a);
	}
}
