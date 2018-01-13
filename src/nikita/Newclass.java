import java.util.Scanner;

public class Newclass {
	static double  number(
			int min,
			int max
			)
	{
		double number1 =((int)((min + Math.random()  * (max-min))*100))/100.0; 
	return number1;	
	}
static double calc(
         double number1,
         double numbertu,
         double numberfi
         )
{
	double f = number1 +(numbertu *numberfi);
	return f ;
}
         
	public static void main(String[] args) {
				Scanner console = new Scanner(System.in);
		
		double number1 = number(5, 24); 
		double number2 = number(5, 28);
		double number3= number(1, 28);
		System.out.print(number1);
		System.out.print(" + ");
		System.out.print(number2);
		System.out.print(" * ");
		System.out.print(number3);
		System.out.print(" = ");
		double f = calc(number1, number2, number3);

		double a = console.nextDouble();
		if (a>f) {
			System.out.println("ответ меньше вашего результата ");
			
		} else if (a<f){
         System.out.println("Ответ больше вашего результата");			
		} else {
			System.out.println("Ответ правильный");
		}
		
		
		
console.close();
	}

}
