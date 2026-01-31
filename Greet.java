import java.util.Scanner;

public class Greet{
	public static void main(String[] args){
		String message = myGreet("amy");
		System.out.println(message);
		
	}
	
	static String myGreet(String name ){
		String myGreet= "hiiii" + name;
		return myGreet;
		
	}
}