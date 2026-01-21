import java.util.Scanner;

public class VolumePrism{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int b = input.nextInt();
		
		int h = input.nextInt();
		
		int l = input.nextInt();
		
		double volume = l*b* h;
		
		System.out.println(volume);
		
		input.close();
	}
}