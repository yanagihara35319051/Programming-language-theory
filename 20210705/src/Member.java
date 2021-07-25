
public class Member implements IMember{

	private String name;
	@Override
	public void print() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(name);
	}

	@Override
	public String GetName() {
		// TODO 自動生成されたメソッド・スタブ
		
		return name;
	}

	@Override
	public void setName(String n) {
		// TODO 自動生成されたメソッド・スタブ
		name = n;
	}
	
	
}
