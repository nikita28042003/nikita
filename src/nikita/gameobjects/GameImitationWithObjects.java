package nikita.gameobjects;

import java.util.Scanner;

public class GameImitationWithObjects {
	static void outUnit(Unit unit) {
		System.out.print("Информация о юните ");
		System.out.print(unit.order);
		System.out.println(" ���������:");
		System.out.print("����� ");
		System.out.print(unit.attack);
		System.out.println(" �����");
		System.out.print("������ ");
		System.out.print(unit.defense);
		System.out.println(" �����");
		System.out.print("�������� ");
		System.out.print(unit.health);
		System.out.println(" �����");
		System.out.print("���� ");
		System.out.print(unit.damage);
		System.out.println(" �����");
	}

	static Unit inUnit(Scanner console, int order) {
		Unit unit = new Unit();
		unit.order = order;
		System.out.print("������� �������������� ");
		System.out.print(order);
		System.out.println("-�� ���������.");
		System.out.print("�����: ");
		unit.attack = console.nextDouble();
		System.out.print("������: ");
		unit.defense = console.nextDouble();
		System.out.print("��������: ");
		unit.health = console.nextDouble();
		System.out.print("����: ");
		unit.damage = console.nextDouble();
		return unit;
	}

	public static void main(String[] args) {
		Knight knight = new Knight();

		knight.sword = new Sword();
		knight.sword.weight = 765;
		knight.spear= new Spear();
		knight.spear.weight = 12;
		knight.bow= new Bow();
		knight.bow.weight=123; 
		knight.shield=new Shield();
		knight.shield.weight=89;
		knight.armor=new Armor();
		knight.armor.weight=65;
		knight.helmet=new Helmet();
		knight.helmet.weight=31;
		System.out.print("Общий вес всех предметов :");
		System.out.println(knight.totalWeight());
		knight.sword.damage = 125;
		knight.spear.damage = 876;
		knight.bow.damage=123; 
		System.out.print("Общий урон предметов :");
		System.out.println(knight.totalDamage());
		knight.shield.defense=89;
		knight.armor.defense=65;
		knight.helmet.defense=31;
		System.out.print("Общая защита предметов : ");
		System.out.println(knight.totalDefense());
		Scanner console = new Scanner(System.in);
		System.out.println("Перед боем рыцарь решил сделать перекус");
		Dinner dinner = new Dinner();
		dinner.soup = new Soup();
		dinner.soup.proteins =12;
		dinner.soup.fats=123;
		dinner.soup.carbons = 56;
		dinner.secondCourse = new SecondCourse ();
		dinner.secondCourse.fats = 123;
		dinner.secondCourse.proteins = 89;
		dinner.garnish= new Garnish();
		dinner.garnish.carbons = 97;
		dinner.garnish.proteins = 123;
		dinner.vegetables = new Vegetables ();
		dinner.vegetables.carbons =9;
		dinner.vegetables.fats=123;
		dinner.drink=new Drink();
		dinner.drink.carbons = 72;
		System.out.print("Общее количество белков : ");
		System.out.println(dinner.totalProteins());
		System.out.print("Общее количество жиров : ");
		System.out.println(dinner.totalFats());
		System.out.print("Общее количество углеводов : ");
		System.out.println(dinner.totalCarbons());
		Unit unit1 = inUnit(console, 1);
		Unit unit2 = inUnit(console, 2);
		System.out.println("1-�� �������� ������� 2-�� ��������");
		unit2.attack(unit1);
		if(unit2.isAlive()) {
			outUnit(unit2);
			System.out.println("2-�� �������� ��� ����� 1-�� ���������");
			unit1.attack(unit2);
			if(unit1.isAlive()) {
				outUnit(unit1);
				System.out.println("2-�� �������� ������� 1-�� ��������");
				unit1.attack(unit2);
				if(unit1.isAlive()) {
					outUnit(unit1);
					System.out.println("1-�� �������� ��� ����� 2-�� ���������");
					unit2.attack(unit1);
					if(unit2.isAlive()) {
						System.out.println("��� ������� � �����");
						outUnit(unit1);
						outUnit(unit2);
					} else {
						System.out.println("2-�� �������� ����");
					}
				} else {
					System.out.println("1-�� �������� ����");
				}
			} else {
				System.out.println("1-�� �������� ����");
			}
		} else {
			System.out.println("2-�� �������� ����");
		}
		console.close();
	}
}