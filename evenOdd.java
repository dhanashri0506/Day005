package hw;
import java.util.Scanner;
public class evenOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = 10;
        int[] elements = new int[n];

       
        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            elements[i] = scanner.nextInt();
        }

        
        int[] evenNumbers = new int[n];
        int[] oddNumbers = new int[n];
        int evenCount = 0;
        int oddCount = 0;

        
        for (int i = 0; i < n; i++) {
            if (elements[i] % 2 == 0) {
                evenNumbers[evenCount] = elements[i];
                evenCount++;
            } else {
                oddNumbers[oddCount] = elements[i];
                oddCount++;
            }
        }

        System.out.println("Even numbers:");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        System.out.println("\nOdd numbers:");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        scanner.close();

        
        
	}

}
