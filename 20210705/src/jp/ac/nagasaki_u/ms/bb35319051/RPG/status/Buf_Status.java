package jp.ac.nagasaki_u.ms.bb35319051.RPG.status;

public class Buf_Status {
	private double bufAT;
	private double bufHP;
	private double bufMP;
	private double bufMG;
	
	public Buf_Status(){
		bufAT=1.0;
		bufHP=1.0;
		bufMP=1.0;
		bufMG=1.0;
	}
	public Buf_Status(double at,double hp,double mp,double mg){
		bufAT=at;
		bufHP=hp;
		bufMP=mp;
		bufMG=mg;
	}
	
	public  Status Buf(Status status) {
		status.setAtack((int)(status.getAtack()*bufAT));
		status.setHP((int)(status.getHP()*bufHP));
		status.setMP((int)(status.getMP()*bufMP));
		status.setMagical((int)(status.getMagical()*bufMG));
		return status;
	}
}
