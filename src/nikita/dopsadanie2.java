package nikita;

import java.util.Scanner;

public class dopsadanie2 {
	public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	System.out.println("������ ������� ��� ");
	double a = console.nextDouble();
    System.out.println("������ ��� �� ��������/������������ �����");
    int b = console.nextInt();
    System.out.println("������ ��� �� ����������");
    int c = console.nextInt();
    System.out.println("������ ��� �� ������");
    int d = console.nextInt();
    System.out.println("������ ��������� ��� ");
    int f=console.nextInt();
    double n;
    n = (a *10) + b+c+d ;
    boolean x;
    x = n>=f && b>10 && c>15 && d >15;
    System.out.println(x);
  }

}
