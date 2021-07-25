package jp.ac.nagasaki_u.ms.bb35319051.RPG.magic;

import java.util.ArrayList;

import jp.ac.nagasaki_u.ms.bb35319051.RPG.character.Character;

public interface InterfaceMagicList {
	public void setMagic(Magic magic);
	
	public ArrayList<Magic> getMagicList();

	public void setMagicList(ArrayList<Magic> magicList);
	
	public void printMagicList();
	
	public Magic searchMagic(String nam);
	
	public String searchNameIndex(int Index);
	
	public Character UseMagic(String na,Character me,Character a);
	
	public Character selectMagic(Character me,Character Enemy);
	
}