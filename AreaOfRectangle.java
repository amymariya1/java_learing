import java.util.Scanner;

public class AreaOfRectangle{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the lenght :");
		int l = input.nextInt();
		
		System.out.println("enter the breadth :");
		int b = input.nextInt();
		
		double area = l*b;
		
		System.out.println(area);
		
		
		input.close();
	}
}