package jp.ac.nagasaki_u.ms.bb35319051.RPG.character;

import java.util.ArrayList;

import jp.ac.nagasaki_u.ms.bb35319051.RPG.position.Position;
import jp.ac.nagasaki_u.ms.bb35319051.RPG.status.InterfaceStatus;
import jp.ac.nagasaki_u.ms.bb35319051.RPG.status.Status;

public  class Character implements InterfaceStatus{
	private String name;
	private Position position;
	private Status status;
	private String state;
	private Status NowStatus;
	protected static int count;
	private static ArrayList<Character> CharList = new ArrayList<>();
	
	public static ArrayList<Character> getCharList() {
		return CharList;
	}

	public static void setCharList(ArrayList<Character> charList) {
		CharList = charList;
	}

	public static int getCount() {
		return count;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Status getNowStatus() {
		return NowStatus;
	}
	public void setNowStatus(Status nowStatus) {
		NowStatus = nowStatus;
	}
	
	public int getAtack() {
		return status.getAtack();
	}
	
	public void setAtack(int atack) {
		status.setAtack(atack);
	}
	
	public int getHP() {
		return status.getHP();
	}
	
	public void setHP(int hP) {
		 status.setHP(hP);
	}
	public int getMP() {
		return status.getMP();
	}
	
	public void setMP(int mP) {
		status.setMP(mP);
	}
	
	public int getMagical() {
		return status.getMagical();
	}
	
	public void setMagical(int Magical) {
		status.setMagical(Magical);
	}
	public int getNowAtack() {
		return NowStatus.getAtack();
	}
	
	public void setNowAtack(int atack) {
		status.setAtack(atack);
	}
	
	public int getNowHP() {
		return NowStatus.getHP();
	}
	
	public void setNowHP(int hP) {
		 NowStatus.setHP(hP);
	}
	public int getNowMP() {
		return NowStatus.getMP();
	}
	
	public void setNowMP(int mP) {
		NowStatus.setMP(mP);
	}
	
	public int getNowMagical() {
		return NowStatus.getMagical();
	}
	
	public void setNowMagical(int magical) {
		NowStatus.setMagical(magical);
	}
	
	public void printMagicList() {
		position.printMagicList();
	}
	
	public String searchNameIndex(int i) {
		return position.searchNameIndex(i);
	}
	public Character selectMagic(Character me,Character enemy) {
		return position.selectMagic(me, enemy);
	}
	public Character UseMagic(String na,Character a) {
		return position.UseMagic(na,this,a);
			
	}
	
	public Character Atack(Character enemy) {
		enemy.setNowHP(enemy.getNowHP()-(int)(NowStatus.getAtack()*0.5));
		System.out.println(enemy.getName()+"に"+NowStatus.getAtack()*0.5+"ダメージ！");
		if(enemy.getNowStatus().getHP()<=0) {
			enemy.getNowStatus().setHP(0);
			enemy.setState("die");
		}
		return enemy;
		
	}
	
	public void print() {
		System.out.println("name:"+getName());
		System.out.print("position:");
		position.print();
		System.out.println("status:");
		getStatus().print();
		System.out.println("state:"+getState());
	}
}
