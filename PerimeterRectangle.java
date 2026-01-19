import java.util.Scanner;

public class PerimeterRectangle{
	public static void main(String[] args){
	
	Scanner input = new Scanner( System.in);
	
	int l = input.nextInt();
	
	int w = input.nextInt();
	
	double peri = 2*(l+w);
	
	System.out.println(peri);
	
	}
}