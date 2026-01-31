import java.util.Scanner;

public class Sum2{
	public static void main(String[] args){
		sum();
		sum();
		sum();
	}
	
	static void sum(){
	Scanner input = new Scanner(System.in);
	
	System.out.println("enter the frist number :");
	int num1 = input.nextInt();
	
	System.out.println("enter the second number :");
	int num2 = input.nextInt();
	
	int sum = num1 + num2;
	
	System.out.println(sum);
	}
}