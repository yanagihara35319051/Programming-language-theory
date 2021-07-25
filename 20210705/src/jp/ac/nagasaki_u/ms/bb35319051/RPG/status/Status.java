package jp.ac.nagasaki_u.ms.bb35319051.RPG.status;

public class Status implements InterfaceStatus{
	private int Atack;
	private int HP;
	private int MP;
	private int Magical;
	
	public Status(){
		setAtack(0);
		setHP(0);
		setMP(0);
		setMagical(0);
	}
	public Status(int atack,int hp,int mp,int magical){
		setAtack(atack);
		setHP(hp);
		setMP(mp);
		setMagical(magical);
	}
	public int getAtack() {
		return Atack;
	}
	public void setAtack(int atack) {
		Atack = atack;
	}
	public int getHP() {
		return HP;
	}
	public void setHP(int hP) {
		HP = hP;
	}
	public int getMP() {
		return MP;
	}
	public void setMP(int mP) {
		MP = mP;
	}
	public int getMagical() {
		return Magical;
	}
	public void setMagical(int magical) {
		Magical = magical;
	}
	public void print() {
		System.out.println("Atack:"+getAtack());
		System.out.println("HP:"+getHP());
		System.out.println("MP:"+getMP());
		System.out.println("Magical:"+getMagical());
		
	}
}
