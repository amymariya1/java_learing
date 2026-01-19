import java.util.Scanner;

public class Perimeter{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int r = input.nextInt();
		
		double result = 2 *Math.PI* r;
		
		System.out.println(result);
		
	}
}