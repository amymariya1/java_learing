import java.util.Scanner;

public class Sum{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the total numbers :");
		int n = input.nextInt();
		
		System.out.println("enter the numbers :");
		
		
		int sum =0;
		
		for(int i =1; i <=n; i++){
			int num = input.nextInt();
		 sum = sum+num;
		
		}
		System.out.println(sum);
		
		
		input.close();
	}
}
