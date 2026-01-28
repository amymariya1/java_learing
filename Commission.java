import java.util.Scanner;

public class Commission{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the total sales :");
		int sales = input.nextInt();
		int commission =0;
		int bonus = 0;
		
		if(sales < 50000){
			commission = sales *5/100;
		}
		else if(sales < 100000){
			commission = ((50000*5/100)+(sales-50000)*10/100);
		}
		else{
			commission = (50000*5/100)+(50000*10/100)+(sales-100000)*15/100;
		}
		
		
		if (commission >12000){
			 bonus =  2000;
		}
		
		int totalPayout = commission + bonus;

		System.out.println("Commission = " + commission);
System.out.println("Bonus = " + bonus);
System.out.println("Total payout = " + totalPayout);
		input.close();
	}
}