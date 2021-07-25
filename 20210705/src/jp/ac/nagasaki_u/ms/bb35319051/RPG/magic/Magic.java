package jp.ac.nagasaki_u.ms.bb35319051.RPG.magic;

import jp.ac.nagasaki_u.ms.bb35319051.RPG.character.Character;
public abstract class Magic {
	private String name;
	private int cost_MP;
	private double power;
	
	public Magic(){
		name="NoName";
		setCost_MP(0);
	}
	public Magic(String name,int cost,double power) {
		this.name=name;
		setCost_MP(cost);
		this.setPower(power);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost_MP() {
		return cost_MP;
	}
	public void setCost_MP(int cost_MP) {
		this.cost_MP = cost_MP;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}
	public void print() {
		System.out.println(name);
	}
	public boolean equals(String name){
		if(this.name==name) {
			return true;
		}
		else {
			return false;
		}
	}
	
	abstract  public Character effect(Character a,Character enemy);
}
