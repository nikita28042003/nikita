
import java.util.Scanner;

public class GameImitationWithObjects {
	static void outUnit(Unit unit) {
		System.out.print("’арактеристики ");
		System.out.print(unit.order);
		System.out.println(" персонажа:");
		System.out.print("јтака ");
		System.out.print(unit.attack);
		System.out.println(" очков");
		System.out.print("«ащита ");
		System.out.print(unit.defense);
		System.out.println(" очков");
		System.out.print("«доровье ");
		System.out.print(unit.health);
		System.out.println(" очков");
		System.out.print("”рон ");
		System.out.print(unit.damage);
		System.out.println(" очков");
	}

	static Unit inUnit(Scanner console, int order) {
		Unit unit = new Unit();
		unit.order = order;
		System.out.print("¬ведите характеристики ");
		System.out.print(order);
		System.out.println("-го персонажа.");
		System.out.print("атака: ");
		unit.attack = console.nextDouble();
		System.out.print("защита: ");
		unit.defense = console.nextDouble();
		System.out.print("здоровье: ");
		unit.health = console.nextDouble();
		System.out.print("урон: ");
		unit.damage = console.nextDouble();
		return unit;
	}

	public static void main(String[] args) {
		Knight knight = new Knight();
		knight.damage = 123;
		knight.sword = new Sword();
		knight.sword.weight = 765;
		knight.spear= new Spear();
		knight.spear.weight = 12;
		knight.bow= new Bow();
		knight.bow.weight=123; 
		Scanner console = new Scanner(System.in);
		Unit unit1 = inUnit(console, 1);
		Unit unit2 = inUnit(console, 2);
		System.out.println("1-ый персонаж атакует 2-ой персонаж");
		unit2.attack(unit1);
		if(unit2.isAlive()) {
			outUnit(unit2);
			System.out.println("2-ой персонаж даЄт сдачи 1-му персонажу");
			unit1.attack(unit2);
			if(unit1.isAlive()) {
				outUnit(unit1);
				System.out.println("2-ой персонаж атакует 1-ый персонаж");
				unit1.attack(unit2);
				if(unit1.isAlive()) {
					outUnit(unit1);
					System.out.println("1-ый персонаж даЄт сдачи 2-му персонажу");
					unit2.attack(unit1);
					if(unit2.isAlive()) {
						System.out.println("Ѕой окончен в ничью");
						outUnit(unit1);
						outUnit(unit2);
					} else {
						System.out.println("2-ой персонаж убит");
					}
				} else {
					System.out.println("1-ый персонаж убит");
				}
			} else {
				System.out.println("1-ый персонаж убит");
			}
		} else {
			System.out.println("2-ой персонаж убит");
		}
		console.close();
	}
}