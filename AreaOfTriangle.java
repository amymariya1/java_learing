import java.util.Scanner;

public class AreaOfTriangle{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the height :");
		int h = input.nextInt();
		
		System.out.println("enter the base :");
		int b = input.nextInt();
		
		double area = 0.5*b*h;
		
		System.out.println(area);
		
		
		input.close();
	}
}