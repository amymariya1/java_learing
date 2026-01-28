import java.util.Scanner;

public class Discount{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter the price :");
		int price = input.nextInt();
		int discount=0;
		int finalprice =0;
		
		if(price < 2000){
			discount = price * 5/100;
		}
		else if(price > 2000 && price < 5000){
			discount = price * 10/100;
		}
		else{
			discount = price*20/100;
		}
		finalprice= price - discount;
		System.out.println("the discounted price is : "+ finalprice);

        input.close();
    }
}
