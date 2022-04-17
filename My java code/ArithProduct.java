import java.util.Scanner;

public class ArithProduct{

 	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
	
		int largestNumber = 0;
	
		int smallestNumber = 1000;

		System.out.print("Enter first number: ");
		int firstNumber = input.nextInt();

		System.out.print("Enter second number: ");
		int secondNumber = input.nextInt();

		System.out.print("Enter third number: ");
		int thirdNumber = input.nextInt();

		int sum = firstNumber + secondNumber + thirdNumber;
		System.out.printf("sum is %d%n", sum);
	

		int product = firstNumber * secondNumber * thirdNumber;
		System.out.printf("product is %d%n", product);

		int average = sum / 3;
	
		System.out.printf("Average is %d%n", average);

		if (firstNumber > secondNumber && firstNumber > thirdNumber){largestNumber = firstNumber;}

		else if (secondNumber > firstNumber && secondNumber > thirdNumber){largestNumber = secondNumber;}

		else if (thirdNumber > firstNumber && thirdNumber > secondNumber){largestNumber = thirdNumber;}
	
		if (firstNumber < secondNumber && firstNumber < thirdNumber){smallestNumber = firstNumber;}

		else if (secondNumber < firstNumber && secondNumber < thirdNumber){smallestNumber = secondNumber;}

		else if (thirdNumber < firstNumber && thirdNumber < secondNumber){smallestNumber = thirdNumber;}
	
		System.out.printf("LargestNumber is " + largestNumber);
	
		System.out.printf("SmallestNumber is " + smallestNumber);

  	}

}

	
	

	
	



  