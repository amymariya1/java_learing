import java.util.Scanner;

public class Average{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter how many numbers:");
        int n = input.nextInt();

        int sum = 0;

        System.out.println("Enter the numbers:");
        for (int i = 1; i <= n; i++) {
            int num = input.nextInt();
            sum = sum + num;
        }

        double average = (double) sum / n;

        System.out.println("Average = " + average);

        input.close();
    }
}
