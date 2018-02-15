package nikita.other;

import java.util.Scanner;

public class game2 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("������� �������������� 1-�� ���������.");
		System.out.print("�����: ");
		double attack1 = console.nextDouble();
		System.out.print("������: ");
		double defense1 = console.nextDouble();
		System.out.print("��������: ");
		double health1 = console.nextDouble();
		System.out.print("����: ");
		double damage1 = console.nextDouble();
		System.out.println("������� �������������� 2-�� ���������.");
		System.out.print("�����: ");
		double attack2 = console.nextDouble();
		System.out.print("������: ");
		double defense2 = console.nextDouble();
		System.out.print("��������: ");
		double health2 = console.nextDouble();
		System.out.print("����: ");
		double damage2 = console.nextDouble();
		double totalDamage, percent;
		System.out.println("1-�� �������� ������� 2-�� ��������");
		if(attack1 > defense2) {
			percent = (attack1 - defense2) * 0.05;
			if(percent > 4) {
				percent = 4;
			}
			totalDamage = damage1 * (1 + percent);
		} else {
			percent = (defense2 - attack1) * 0.03;
			if(percent < 0.3) {
				percent = 0.3;
			}
			totalDamage = damage1 * (1 - percent);
		}
		if(health2 > totalDamage) {
			health2 = health2 - totalDamage;
		} else {
			health2 = 0;
		}
		if(health2 > 0) {
			System.out.print("�������� 2-��� ��������� ");
			System.out.print(health2);
			System.out.println(" �����");
			System.out.println("2-�� �������� ��� ����� 1-�� ���������");
			if(attack2 > defense1) {
				percent = (attack2 - defense1) * 0.05;
				if(percent > 4) {
					percent = 4;
				}
				totalDamage = damage2 * (1 + percent);
			} else {
				percent = (defense1 - attack2) * 0.03;
				if(percent > 0.3) {
					percent = 0.3;
				}
				totalDamage = damage2 * (1 - percent);
			}
			if(health1 > totalDamage) {
				health1 = health1 - totalDamage;
			} else {
				health1 = 0;
			}
			if(health1 > 0) {
				System.out.print("�������� 1-��� ��������� ");
				System.out.print(health1);
				System.out.println(" �����");
				// 2-�� �������� ������� 1-�� ��������
				System.out.println("2-�� �������� ������� 1-�� ���������");
				if(attack2 > defense1) {
					percent = (attack1 - defense2) * 0.05;
					if(percent > 4) {
						percent = 4;
					}
					totalDamage = damage2 * (1 + percent);
				} else {
					percent = (defense1 - attack2) * 0.03;
					if(percent < 0.3) {
						percent = 0.3;
					}
					totalDamage = damage2 * (1 - percent);
				}
				if(health1 > totalDamage) {
					health1 = health1 - totalDamage;
				} else {
					health1 = 0;
				}
				if(health1 > 0) {
					System.out.print("�������� 1-��� ��������� ");
					System.out.print(health1);
					System.out.println(" �����");
					System.out.println("1-�� �������� ��� �����  2-�� ���������");
					if(attack1 > defense2) {
						percent = (attack1 - defense2) * 0.05;
						if(percent > 4) {
							percent = 4;
						}
						totalDamage = damage1 * (1 + percent);
					} else {
						percent = (defense2 - attack1) * 0.03;
						if(percent > 0.3) {
							percent = 0.3;
						}
						totalDamage = damage1 * (1 - percent);
					}
					if(health2 > totalDamage) {
						health2 = health2 - totalDamage;
					} else {
						health2 = 0;
					}
					if(health2 > 0) {
						System.out.print("�������� 2-��� ��������� ");
						System.out.print(health2);
						System.out.println(" �����");
					}
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
