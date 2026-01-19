import java.util.Scanner;

public class PerimeterEquilateral{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		
		double peri = 3 * a ;
		
		System.out.println(peri);
		
		input.close();
		
		
	}
}