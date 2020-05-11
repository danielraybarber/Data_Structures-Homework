import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class data {

	public static void main(String[] args) {
		/*
		Loop and Map.Entry Exercises Homework
		Ask the user for 5 numbers,

		store them in an array list,

		then find the sum, product, largest, and smallest of those numbers.

		You are a car dealer - create a hash map of vehicles:

		The model is the Key, the make is the Value.

		Ask the customer what car (model) they are looking for,

		use the HashMap to determine if you have that vehicle, and what make it is.

		(e.g., "Oh, you're looking for a Civic? Our Honda selection is right over here...")
	*/
		
		System.out.println("Lets create an Array!");
		
		// first number
		System.out.println("Insert a number: ");
		Scanner input1 = new Scanner(System.in);
		int num1 = input1.nextInt(); 
		
		// second number
		System.out.println("Insert another number: ");
		Scanner input2 = new Scanner(System.in);
		int num2 = input2.nextInt(); 
		
		//third number
		System.out.println("Insert another number: ");
		Scanner input3 = new Scanner(System.in);
		int num3 = input3.nextInt(); 
		
		//fourth number
		System.out.println("Insert another number: ");
		Scanner input4 = new Scanner(System.in);
		int num4 = input4.nextInt(); 
		
		 //fifth number
		System.out.println("Insert another number: ");
		Scanner input5 = new Scanner(System.in);
		int num5 = input5.nextInt();
		
		//initialize array
		int[] my_array = {num1, num2, num3, num4, num5}; 
		
		//display array to user
		System.out.println("Your given array's is: " + Arrays.toString(my_array)); 
		
		//get array sum
		int sum = 0;
		for(int i = 0; i< 5; i++) {
			
			sum = sum + my_array[i];
		}
		
		//display array sum
		System.out.println("Your array sum = " + sum);
		
		// get array product
		long product = 1;
		for(int i = 0; i< 5; i++) {
			
			product = product * my_array[i];
		}

		//display product
		System.out.println("Your array's total product = " + product);
		
		//get largest number entered into array
		int max = Arrays.stream(my_array).max().getAsInt(); 
		
		//display largest number
		System.out.println("The largest number in your array is: " + max);
		
		Arrays.sort(my_array);
		
		int smallest = my_array[0];
		
		System.out.println("Your smallest number is: " + smallest);
		
		
		// Car Hash Map 
		
		// create hash map
		HashMap<String, String> cars = new HashMap<>();
		
		// add make and models
		cars.put("Civic" , "Honda");
		cars.put("Model 3" , "Tesla");
		cars.put("Gladiator" , "Jeep");
		cars.put("Vue" , "Saturn");
		cars.put("Altima" , "Nissan");
		
		//get user input
		System.out.println("What car model are you looking for? ");
		Scanner model = new Scanner(System.in);
		String modelName = model.next();
		
		// if statement to pull value(make) from the model they input
		if(cars.containsKey(modelName)) {
			System.out.println("Oh you're looking for our " + cars.get(modelName) + " section. Right this way! ");
		}else {
			System.out.println("We don't have that car I'm sorry. ");
		}
		
		
		
		
	}

}
