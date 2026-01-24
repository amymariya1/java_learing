import java.util.Scanner;

public class SumOfAll{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		int num ;
		
		System.out.println("enter an number :");
		
		while(true){
			num = input.nextInt();
			
			if(num==0){
				break;
			}
			sum = sum+num;
			
		}
		System.out.println("sum of all number " + sum);
	  
	  
	  input.close();
	}
}