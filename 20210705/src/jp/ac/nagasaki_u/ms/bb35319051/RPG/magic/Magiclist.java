package jp.ac.nagasaki_u.ms.bb35319051.RPG.magic;

import java.util.ArrayList;
import java.util.Scanner;

import jp.ac.nagasaki_u.ms.bb35319051.RPG.character.Character;

public class Magiclist implements InterfaceMagicList {

	private ArrayList<Magic> MagicList = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);

	@Override
	public void setMagic(Magic magic) {
		MagicList.add(magic);

	}

	@Override
	public ArrayList<Magic> getMagicList() {
		return MagicList;
	}

	@Override
	public void setMagicList(ArrayList<Magic> magicList) {
		MagicList = magicList;

	}

	public void printMagicList() {
		for (int i = 0; i < MagicList.size(); i++) {
			System.out.println((i + 1) + ":" + MagicList.get(i).getName());
		}
	}

	@Override
	public Magic searchMagic(String nam) {
		for (int j = 0; j < getMagicList().size(); j++) {
			if (getMagicList().get(j).equals(nam) == true) {
				return getMagicList().get(j);
			}

		}
		return null;
	}

	public String searchNameIndex(int index) {
		return MagicList.get(index).getName();
	}

	public Character selectMagic(Character me, Character enemy) {
		int baf;
		int baf2;

		while (true) {
			printMagicList();
			System.out.println((MagicList.size() + 1) + ":戻る");
			try {
				baf = Integer.parseInt(scanner.next());
			} catch (java.lang.NumberFormatException e) {
				System.out.println("対応した数字を入力してください");
				continue;
			}
			if (baf <= MagicList.size()) {
				while (true) {
					System.out.println("対象を選択してください");
					for (int i = 1; i <= Character.getCount(); i++) {
						System.out.println(i + ":" + Character.getCharList().get(i-1).getName());
					}
					System.out.println((Character.getCharList().size() + 1) + ":戻る");
					try {
						baf2 = Integer.parseInt(scanner.next());
					} catch (java.lang.NumberFormatException e) {
						System.out.println("対応した数字を入力してください");
						continue;
					}
					if(baf2<=Character.getCharList().size()) {
						return Character.getCharList().set((baf2-1),UseMagic(MagicList.get(baf - 1).getName(), me,Character.getCharList().get(baf2-1) ));
					}
				}

			} else if (baf == (MagicList.size() + 1)) {
				return null;
			} else {
				System.out.println("対応した数字を入力してください");
				continue;
			}
		}
	}

	public Character UseMagic(String na, Character me, Character a) {
		Magic magic;
		magic = searchMagic(na);
		System.out.println(na + "を使った！");
		if (magic != null) {
			magic.effect(me, a);
		} else {
			System.out.println("エラー");
		}
		if (a.getNowStatus().getHP() <= 0) {
			a.getNowStatus().setHP(0);
			a.setState("die");
		} else if (a.getNowHP() < a.getHP()) {
			a.setNowHP(a.getHP());
		}
		return a;
	}

}
