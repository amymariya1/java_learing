import java.util.Scanner;

public class Fibonacci{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number :");
		
		int n = input.nextInt();
		
		
		int a = 0;
		int b = 1;
		
		for(int i=1; i<=n; i++){
			
			int temp = a +b;
			a= b;
			b= temp;
			
			System.out.println(a);
			
		}
		
		input.close();
	}
}