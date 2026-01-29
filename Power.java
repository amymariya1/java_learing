import java.util.Scanner;

public class Power{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the based and exponent :");
		int base = input.nextInt();
		int exponent = input.nextInt();
		
		double result = Math.pow(base , exponent);
		
		System.out.println(result);
		
		input.close();
	}
}
