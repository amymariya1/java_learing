public class Reminder{
	public static void main(String [] args ){
		
		int n= 233346738;
		int count= 0;
		
		while(n>0){
			int reminder= n%10;
			
			if(reminder==7){
			count++;	
			}
			
			n= n/10;
			}
			System.out.println(count);
		
	}
}