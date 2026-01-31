import java.util.Scanner;

public class Return{
	public static void main(String[] args){
		String message = greet();
		System.out.println(message);
	}
	static String greet(){
		String greeting = "hiiii, how are you";
		return greeting;
	}
}