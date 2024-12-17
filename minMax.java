package hw;
import java.util.Scanner;
public class minMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        int n = 10; 
        int[] elements = new int[n];

        
        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            elements[i] = scanner.nextInt();
        }

       
        int min = findMinimum(elements);
        int max = findMaximum(elements);

        
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);

        scanner.close();
    }

    
    public static int findMinimum(int[] array) {
        int min = array[0]; 
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i]; 
            }
        }
        return min;
    }

    
    public static int findMaximum(int[] array) {
        int max = array[0]; 
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; 
            }
        }
        return max;

	}

}
