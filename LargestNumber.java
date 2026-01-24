import java.util.Scanner;

public class LargestNumber{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int num;
		int result=0;
		
		System.out.println("enter number :");
		
		while(true){
			num = input.nextInt();
			
			if(num ==0){
				break;
			}
			 result = Math.max(result,num);
		}
		System.out.println(result);
	  
	  
	  input.close();
	}
}