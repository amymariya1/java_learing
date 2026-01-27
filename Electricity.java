import java.util.Scanner;

public class Electricity{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the units :");
		int units = input.nextInt();
		
		int result = 0;
		
		
		if(units <= 100){
			result = (100*2)+50;
			System.out.println(result);
		}
		else if( units <= 200){
			result = ((100*2)+((units - 100)*3))+50;
			System.out.println(result);
		}
		else{
			result = ((100*2)+(100*3)+((units - 200)*5))+50;
			System.out.println(result);
		}
		input.close();
	}
}