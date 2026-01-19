import java.util.Scanner;

public class PerimeterParallelogram{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		
		int b = input.nextInt();
		
		double peri = 2*(a+b);
		
		System.out.println(peri);
		
		input.close();
		
		
	}
}