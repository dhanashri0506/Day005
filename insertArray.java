package hw;
import java.util.Scanner;

public class insertArray {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter the number of elements you want to insert: ");
	        int n = scanner.nextInt();
	        String[] elements = new String[n];


	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter element " + (i + 1) + ": ");
	            elements[i] = scanner.next();
	        }

	        
	        System.out.print("Enter the element you want to search for: ");
	        String target = scanner.next();

	        
	        int index = searchElement(elements, target);
	        if (index != -1) {
	            System.out.println("Element '" + target + "' found at index " + index + ".");
	        } else {
	            System.out.println("Element '" + target + "' not found in the array.");
	        }

	        scanner.close();
	    }

	    
	    public static int searchElement(String[] elements, String target) {
	        for (int i = 0; i < elements.length; i++) {
	            if (elements[i].equals(target)) {
	                return i; 
	            }
	        }
	        return -1; 

	}

}
