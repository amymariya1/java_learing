import java.util.Scanner;

public class AreaOfCircle{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("enter area :");
		int r = input.nextInt();
		
		double result = (Math.PI * Math.pow(r,2));
		
		System.out.println(result);
		
		input.close();
	}
}