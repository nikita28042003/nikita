package nikita.other;

import java.util.Scanner;

public class dopsadanie {
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
    x = n>=f;
    System.out.println(x);
  }

}
