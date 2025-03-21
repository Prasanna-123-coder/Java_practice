
	import java.util.Scanner;

	public class CustomFibonacci {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();

	       
	        System.out.print("Enter the length of the Fibonacci sequence: ");
	        int length = scanner.nextInt();

	        System.out.println("Fibonacci sequence:");
	        System.out.print(num1 + " " + num2);

	        for (int i = 3; i <= length; i++) {
	            int next = num1 + num2;
	            System.out.print(" " + next);
	            num1 = num2;
	            num2 = next;
	        }
	    }
	}



