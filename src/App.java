
public class App {

	public static int subtractFirstFromLast(int[] intArray) {
		//This method runs through an array of integers, saving the value of the first element and subtracting
		// the first element from the last element. After, it prints to console all of the involved numbers.
		// Returns the difference between the last number and the first.
		// for 1. A and B
		
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
		// for 1. C
		float average = 0, sum = 0;
		
		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}
		
		average = sum / intArray.length;
		
		return average;
	}
	
	public static float findAverageNameLength(String[] namesArray) {
		// This method iterates through an array of strings, adding all of the lengths together, and solving for average length.
		// for 2. A
		float averageLetters = 0, sumOfLetters = 0;
		
		for (int i = 0; i < namesArray.length; i++) {
			sumOfLetters += namesArray[i].length();
		}
		
		averageLetters = sumOfLetters / namesArray.length;
		
		return averageLetters;
		
	}
	
	public static String allNamesTogether(String[] namesArray) {
		// This method iterates through an array of strings, making a new String with all names separated by spaces
		// for 2. B
		
		String allNames = ""; //create empty string
		for (int i = 0; i < namesArray.length; i++) {
			allNames += namesArray[i] + " ";
		}
		
		return allNames;
	}
	
	public static String concatenateStringNTimes(String word, int n) {
		// this method concatenates a word to itself N times
		// for 7.
		String fullString = "";
		
		for (int i = 0; i < n; i++) {
			fullString += word;
		}
		
		return fullString;
	
	}
	
	public static String makeFullName(String firstName, String lastName) {
		//This string takes a firstName and lastName, then creates a new string, fullName, with firstName and lastName
		// separated by a space.
		// for number 8
		String fullName = firstName + " " + lastName;
		
		return fullName;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		// 1. a. Programmatically subtract the value of the first element in the array from the value in the
		//  	last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
		
		subtractFirstFromLast(ages);
		
		// 1. b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		
		System.out.println("\ndifference with an extra element (105)");
		int[] newAges = {3, 9, 23, 64, 2, 8, 28, 93, 105};
		subtractFirstFromLast(newAges);
		
		System.out.println("\nAverage of all numbers in ages array: " + findAverage(ages)); //print averages to console
		System.out.println("Average of all numbers in newAges array: " + findAverage(newAges));
		
		// 2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		// 2. a
		System.out.println("\nProblem 2: \nAverage name length: " + findAverageNameLength(names));
		
		//2. b
		System.out.println("All the names in one string: " + allNamesTogether(names));
		
		//5. array with lengths of all names 
		int[] nameLengths = new int[6];
		
		// iterate through array of names, storing the length of each name
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		//6. iterate through array and find sum of all elements
		
		int lengthsSum = 0;
		
		for (int i = 0; i < nameLengths.length; i++) {
			lengthsSum += nameLengths[i];
		}
		System.out.println("Sum of all name lengths: " + lengthsSum);
		
		//7. write a method that takes a string, word, and an int, n, as arguments and returns the word concatenated to itself n number of 
		// times.
		
		System.out.println("\nWord concatenated n times: " + concatenateStringNTimes("Hello", 3));
		
		//8. Method that takes firstName and lastName, returning full name
		System.out.println("\nFull name: " + makeFullName("Matthew", "Blaire"));
		
	}

	// 10. method that finds average of all numbers in array of doubles, returns true if average > 100, false if not.
	public static boolean isAverageGreaterThan100(double[] doubleArray) {
		
		double sum = 0, average = 0; 
		
		for (int i = 0; i < doubleArray.length; i++) { //iterate through array storing sum of all elements
			sum += doubleArray[i];
		}
		
		average = sum / doubleArray.length; //calculate average
		
		if (average > 100) { //if average is greater than 100, return true
			return true;
		} else {
			return false;
		}
		
	}
	
	// 11.	Write a method that takes two arrays of double and returns true if the average of the elements in the
	// first array is greater than the average of the elements in the second array.
	
	public static boolean compareAverages(double[] firstArray, double[] secondArray) {
		
		double sumOfAll = 0, firstAverage = 0, secondAverage = 0;
		
		for (int i = 0; i < firstArray.length; i++) { //iterate through first array
			sumOfAll += firstArray[i];
		}
		firstAverage = sumOfAll / firstArray.length;
		
		sumOfAll = 0; //reset sum
		for (int i = 0; i < secondArray.length; i++) { //iterate through second array
			sumOfAll += secondArray[i];
		}
		secondAverage = sumOfAll / secondArray.length;
		
		
		if (firstAverage > secondAverage) {
			return true;
		} else {
			return false;
		}
	
	}
	
	//12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a 
	// double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
		
	}
	
	//13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	// My method is willItFit, I just moved into a new apartment and I keep needing to measure my room, and the furniture to
	// see if it will fit. It takes four arguments, all doubles. furnitureWidth, furnitureLength, spaceWidth, spaceLength. It 
	// calculates the area of the furniture and the area of the available space. If the furniture is too large, return false.
	
	public static boolean willItFit(double furnitureWidth, double furnitureLength, double spaceWidth, double spaceLength) {
		
		double furnitureArea = 0, spaceArea = 0;
		
		furnitureArea = furnitureWidth * furnitureLength;
		spaceArea = spaceWidth * spaceLength;
		
		if (furnitureArea < spaceArea) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	

}
