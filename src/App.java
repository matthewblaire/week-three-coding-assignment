
public class App {

	public static int subtractFirstFromLast(int[] intArray) {
		//This method runs through an array of integers, saving the value of the first element and subtracting
		// the first element from the last element. After, it prints to console all of the involved numbers.
		// Returns the difference between the last number and the first.
		
		int difference = 0, firstNum = 0; //variables to store the numbers I need for calculation
		
		for (int i = 0; i < intArray.length; i++) { //run through array until completion
			if (i == 0) { // capture first number
				
				firstNum = intArray[i];
				
			} else if (i == intArray.length - 1) { // subtract first number from last number, print to console
				
				difference = intArray[i] - firstNum;
				System.out.println("First number in array: " + firstNum);
				System.out.println("Last number in array: " + intArray[i]);
				System.out.println(intArray[i] + " - " + firstNum + " = " + difference);
				
			}
		}
		
		return difference;
		
	}
	
	public static float findAverage (int[] intArray) {
		// this method iterates through an array of integers, finding the sum of all elements and returning an average.
		float average = 0, sum = 0;
		
		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}
		
		average = sum / intArray.length;
		
		return average;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		// 1. a. Programmatically subtract the value of the first element in the array from the value in the
		//  	last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
		
		subtractFirstFromLast(ages);
		
		//1. b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		
		System.out.println("\ndifference with an extra element (105)");
		int[] newAges = {3, 9, 23, 64, 2, 8, 28, 93, 105};
		subtractFirstFromLast(newAges);
		
		System.out.println("\nAverage of all numbers in ages array: " + findAverage(ages));
		System.out.println("\nAverage of all numbers in newAges array: " + findAverage(newAges));
		
	}

}
