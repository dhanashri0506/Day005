package hw;
import java.util.Arrays;
public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int[] array1 = {10, 20, 30, 40};
		        int[] array2 = {50, 60, 70, 80};

		        
		        int[] mergedArray = mergeArrays(array1, array2);

		        
		        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
		    }

		   
		    public static int[] mergeArrays(int[] array1, int[] array2) {
	
		        int[] result = new int[array1.length + array2.length];

		       
		        System.arraycopy(array1, 0, result, 0, array1.length);

		        
		        System.arraycopy(array2, 0, result, array1.length, array2.length);

		        return result;
	}

}
