package jp.ac.nagasaki_u.ms.bb35319051.RPG.position;

import java.util.ArrayList;
import java.util.Scanner;
public class PositionList {
	private ArrayList<Position>positionlist = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	private int selectNum;
	private String baf;
	
	public PositionList() {
		positionlist.add(new Warrior());
		positionlist.add(new Wizard());
		positionlist.add(new Priest());
	}
	
	
	public Position selectposition() {
		while(true) {
			System.out.println("職業を選択してください:");
			for(int  i=0;i<positionlist.size();i++) {
				System.out.println((i+1)+positionlist.get(i).getName()+", ");
			}
			try {
			selectNum=Integer.parseInt(scanner.next());
			}
			catch (java.lang.NumberFormatException e) {
				System.out.println("該当する数字を入力してください");
				continue;
			}
			
			System.out.println(positionlist.get(selectNum-1).getName()+"でよろしいですか？よろしかったらYを入力してください");
			switch(baf=scanner.next()) {
			case "Y":
				System.out.println("職業を"+positionlist.get(selectNum-1).getName()+"に決定しました");
				return positionlist.get(selectNum-1);
			default:
				continue;
			}
		}
	}
}	
