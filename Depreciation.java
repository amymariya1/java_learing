import java.util.Scanner;

public class Depreciation{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the cost ");
		int cost = input.nextInt();
		
		System.out.println("enter the years used :");
		int year = input.nextInt();
		
		System.out.println("enter the rate :");
		int rate = input.nextInt();
		
		double finalValue = cost * Math.pow((1 - rate / 100.0), year);
		
		double depriciation = cost - finalValue;
		
		System.out.println(depriciation);
		
		input.close();
	}
}
