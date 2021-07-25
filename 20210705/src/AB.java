

public class AB extends A implements InterfaceB{
	private B instanceB;
	
	public AB(int a,int b) {
		super(a);
		this.instanceB=new B(b);
	}
	
	public int getB() {
		return instanceB.getB();
	}
}
