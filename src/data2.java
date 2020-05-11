import java.util.Arrays;

public class data2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Write a program to sum all the values of a given array in java
		
		int[] arr = {320, 42, 155, 244, 7, 9};
		
		int sum = 0;
		int size = arr.length;
		for(int i = 0; i< size; i++) {
			
			sum = sum + arr[i];
		}
		System.out.println("Sum of the array is: " + sum);

		
		// 2. What is the output?
		// index would equal 2
		
		// 3. return.
		
		System.out.println(toPower());
		
	}

	public static String toPower(){
		// 3. Write a public static method called toPower that takes in as parameters two integers called size and power.
		//    the method should return an array of size 'size' with each array index raised to the value of 'power'. 
		//    so for example, if i passed in size = 4 and power = 2 to my method the method should return to me the following: [0, 1 ,4, 9]
		
		int size = 4;
		int power = 2;
		
		int[] powerArray = new int[size];
		
		for(int i = 0; i < size; i++) {
			powerArray[i]= i;
		}
		
		for(int j = 0; j < size; j++) {
			powerArray[j] = (int) Math.pow(j, power);
		}
		
		
		return Arrays.toString(powerArray);
		
		
	}

}
