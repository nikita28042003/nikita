package nikita;

import java.util.Scanner;

public class dopsadanie {
	public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	System.out.println("¬вести средний бал ");
	double a = console.nextDouble();
    System.out.println("¬вести бал по русскому/белорусскому €зыку");
    int b = console.nextInt();
    System.out.println("¬вести бал по математике");
    int c = console.nextInt();
    System.out.println("¬вести бал по физике");
    int d = console.nextInt();
    System.out.println("¬вести проходной бал ");
    int f=console.nextInt();
    double n;
    n = (a *10) + b+c+d ;
    boolean x;
    x = n>=f;
    System.out.println(x);
  }

}
