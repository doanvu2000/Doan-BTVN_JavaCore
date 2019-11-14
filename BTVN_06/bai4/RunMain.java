package bai4;

import java.util.Scanner;

public class RunMain {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Lựa chọn player: ");
		System.out.println(1+"."+new Archers().toString());
		System.out.println(2+"."+new Knight().toString());
		
		System.out.print("bạn chọn loại nào: ");
		int chose = sc.nextInt();
		Monsters monsters = new Monsters();
		if (chose == 1) {
			Archers player = new Archers();	
			System.out.println("1 - Player đánh trước");
			System.out.println("2 - Monsters đánh trước");
			System.out.print("nhập: ");
			chose = sc.nextInt();
			battle(player,monsters,chose);
		}
		else {
			Knight player = new Knight();
			System.out.println("1 - Player đánh trước");
			System.out.println("2 - Monsters đánh trước");
			System.out.print("nhập: ");
			chose = sc.nextInt();
			battle(player,monsters,chose);
		}
			
	}
	public static void battle(Archers player, Monsters monsters,int turn) {
		// turn = 1; player đánh trước
		// turn = 2; monster đánh trước
		if (turn == 1) {
			while(!player.dead() && !monsters.dead()) {
				System.out.println(">>>>>>>>>>>>>HERO TURN<<<<<<<<<<<<<");
				player.show_infor();
				System.out.print("chose skill: ");
				int chose = sc.nextInt();
				if(chose == 1) {
					if (!player.checkMP()) {
						monsters.get_dame(player.aim(monsters));
						monsters.setArmor(20); // sau khi bi danh amor ve ban dau
					}
					else {
						System.out.println("Not enough MP, you will hit!");
						monsters.get_dame(player.hit());
					}
				}
				else if(chose == 0) {
					monsters.get_dame(player.hit());
				}
				System.out.println("\n>>>>>>>>>>>>>MONSTERS TURN<<<<<<<<<<<<<");
				monsters.show_infor();
				player.get_dame(monsters.hit());
			}
		}
		else if(turn == 2) {
			while(!player.dead() && !monsters.dead()) {
				System.out.println(">>>>>>>>>>>>>MONSTERS TURN<<<<<<<<<<<<<");
				monsters.show_infor();
				player.get_dame(monsters.hit());
				System.out.println("\n>>>>>>>>>>>>>HERO TURN<<<<<<<<<<<<<");
				player.show_infor();
				System.out.print("chose skill: ");
				int chose = sc.nextInt();
				if(chose == 1) {
					if (!player.checkMP()) {
						monsters.get_dame(player.aim(monsters));
						monsters.setArmor(20); // sau khi bi danh amor ve ban dau
					}
					else {
						System.out.println("Not enough MP, you will hit!");
						monsters.get_dame(player.hit());
					}
				}
				else if(chose == 0) {
					monsters.get_dame(player.hit());
				}
			}
		}
		if (player.dead()) {
			System.out.println("Player is lose !!!");
		}
		else System.out.println("Player is win <3 <3");
	}
	public static void battle(Knight player, Monsters monsters,int turn) {
		if (turn == 1) {
			while(!player.dead() && !monsters.dead()) {
				System.out.println(">>>>>>>>>>>>>HERO TURN<<<<<<<<<<<<<");
				player.show_infor();
				System.out.print("chose skill: ");
				int chose = sc.nextInt();
				if(chose == 1) {
					if (!player.checkMP()) {
						monsters.get_dame(player.shield(monsters));
						monsters.setArmor(20); // sau khi bi danh amor ve ban dau
					}
					else {
						System.out.println("Not enough MP, you will hit!");
						monsters.get_dame(player.hit());
					}
				}
				else if(chose == 0) {
					monsters.get_dame(player.hit());
				}
				System.out.println("\n>>>>>>>>>>>>>MONSTERS TURN<<<<<<<<<<<<<");
				monsters.show_infor();
				player.get_dame(monsters.hit());
			}
		}
		else if(turn == 2) {
			while(!player.dead() && !monsters.dead()) {
				System.out.println(">>>>>>>>>>>>>MONSTERS TURN<<<<<<<<<<<<<");
				monsters.show_infor();
				player.get_dame(monsters.hit());
				System.out.println("\n>>>>>>>>>>>>>HERO TURN<<<<<<<<<<<<<");
				player.show_infor();
				System.out.print("chose skill: ");
				int chose = sc.nextInt();
				if(chose == 1) {
					if (!player.checkMP()) {
						monsters.get_dame(player.shield(monsters));
						monsters.setArmor(20); // sau khi bi danh amor ve ban dau
					}
					else {
						System.out.println("Not enough MP, you will hit!");
						monsters.get_dame(player.hit());
					}
				}
				else if(chose == 0) {
					monsters.get_dame(player.hit());
				}
			}
		}
		if (player.dead()) {
			System.out.println("Player is lose !!!");
		}
		else System.out.println("Player is win <3 <3");
	}
}
