package jp.ac.nagasaki_u.ms.bb35319051.RPG.batlte;

import java.util.Random;
import java.util.Scanner;

import jp.ac.nagasaki_u.ms.bb35319051.RPG.character.Character;
public class Battle {
	private Character Me;
	private Character Enemy;
	private Scanner scanner=new Scanner(System.in);
	private Random random=new Random();
	
	public Battle() {
		Me=null;
		Enemy=null;
	}
	public Battle(Character me,Character enemy) {
		Me = me;
		Enemy = enemy;
	}
	
	private void firstSelect() {
		String baf;

		while(true) {
			System.out.println(Me.getName());
			Me.getPosition().print();
			Me.getNowStatus().print();
			System.out.println(" ");
			System.out.println(Enemy.getName());
			Enemy.getNowStatus().print();
			System.out.println("1：戦う");
			System.out.println("２：逃げる");
			baf=scanner.next();
			
			switch(baf) {
				case "1":
					secondSelect();
					return;
				case "2":
					System.out.println("うまく逃げられた！");
					return;
				default:
					System.out.println("対応した数字を入力してください");
					continue;
			}
		}
	}
	
	private void secondSelect(){
		String baf;
		while(true) {
			System.out.println("1:攻撃");
			System.out.println("2:魔法");
			System.out.println("3:戻る");
			baf=scanner.next();
			switch(baf) {
				case "1":
					Me.Atack(Enemy);
					if(Enemy.getState().equals("die")) {
						finish();
					}
					else {
						Enemyturn();
						firstSelect();
					}
					return;
					
				case "2":
					Character x=Me.selectMagic(Me, Enemy);
					if(x==null) firstSelect();
					else if(Enemy.getName().equals(x.getName())==true) Enemy=x;
					else Me=x;
					
					if(Enemy.getState().equals("die")) {
						finish();
					}
					else {
						Enemyturn();
						firstSelect();
					}
					return;
					
				case "3":
					firstSelect();
					return;
					
				default:
					System.out.println("対応した数字を入力してください");
					continue;
			}
		}
	}
	
	private void finish() {
		System.out.println("敵を倒した!");
		
	}
	
	private void Enemyturn() {
		System.out.println("敵の攻撃！");
		int i=random.nextInt(2);
		int j=random.nextInt(Enemy.getPosition().getMagicList().size());
		switch(i) {
			case 0:
				Enemy.Atack(Me);
				break;
			case 1:
				Enemy.UseMagic(Enemy.searchNameIndex(j), Me);
				break;
		}
		if(Me.getState().equals("die")){
			System.out.println("ゲームオーバー");
			return;
		
		}
	}
	
	
	public void battle() {
		/*String baf;
		int in;
		String name;
		boolean breakFlag=false;
		while(true) {
			System.out.println("１：戦う");
			System.out.println("２：逃げる");
			baf=scanner.next();

			switch(baf) {
				case "1":
					while(true) {
						System.out.println("１：攻撃");
						System.out.println("2:魔法");
						System.out.println("3:戻る");
						baf=scanner.next();
						switch(baf) {
							case "1":
								Me.Atack(Enemy);
								break;
								
							case "2":
								Me.getPosition().printMagicList();
								try {
									in=Integer.parseInt(scanner.next());
								}
								catch(java.lang.NumberFormatException e){
									System.out.println("対応した数字を入力してください");
									continue;
								}
								if(in<=Me.getPosition().getMagicList().size()) {
									Enemy=Me.UseMagic(Me.getPosition().getMagicList().get(in).getName() , Enemy);
								}
								break;
								
							case "3":
								breakFlag=True;
								break;
								
							default:
								System.out.println("対応した数字を入力してください");
								continue;
						}
						if(breakFlag) break;
					}
			}
		}
		return Me;
	}*/
		firstSelect();
		return;
	}
}
