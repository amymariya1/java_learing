import java.util.Scanner;

public class VolumeCylinder{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int r = input.nextInt();
		
		int h = input.nextInt();
		
		double volume = Math.PI*r*r*h;
		
		System.out.println(volume);
		
		input.close();
	}
}