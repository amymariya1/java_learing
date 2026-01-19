import java.util.Scanner;

public class Rhombus{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int p = input.nextInt();
		
		int q = input.nextInt();
		
		int area = (p*q)/2;
		
		System.out.println(area);
		
		input.close();
		
	}
}