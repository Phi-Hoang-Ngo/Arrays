package arrays;

public class SumOfArray {

	public static void main(String[] args) {
		 int[] arr;
		 int totalSum = 0;
	        arr = new int[5];
	        arr[0] = 10;
	        arr[1] = 20;
	        arr[2] = 30;
	        arr[3] = 40;
	        arr[4] = 50;
	        for (int i = 0; i < arr.length; i++)
	        	 totalSum = arr[i] + totalSum;
	    	System.out.println("Sum of all array elements is " + totalSum);

	}
}
