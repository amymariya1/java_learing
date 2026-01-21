import java.util.Scanner;

public class VolumeCone{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int r = input.nextInt();
		
		int h = input.nextInt();
		
		double volume = (Math.PI)*(Math.sqrt(r))*(h/3);
		
		System.out.println(volume);
	}
}