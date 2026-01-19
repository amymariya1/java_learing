import java.util.Scanner;

public class Equilateral{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int side = input.nextInt();
		 
		double area = (Math.sqrt(3)/4) * (Math.pow(side,2));
		
		System.out.println(area);
		
		input.close();
		
	}
}