package hw;
import java.util.Scanner;
public class ascendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int n = 5; 
        int[] elements = new int[n];

        
        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            elements[i] = scanner.nextInt();
        }

       
        bubbleSort(elements);

        
        System.out.println("Sorted array in ascending order:");
        for (int element : elements) {
            System.out.print(element + " ");
        }

        scanner.close();
    }

    
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
	}

}
