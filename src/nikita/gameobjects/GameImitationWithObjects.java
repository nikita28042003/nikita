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