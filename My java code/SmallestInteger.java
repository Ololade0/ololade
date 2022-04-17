import java.util.Scanner;

public class SmallestInteger{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int largestNumber = 10;

	int smallestNumber = 100;

	System.out.print("Enter first number: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter second number: ");
	int secondNumber = input.nextInt();

	System.out.print("Enter third number: ");
	int thirdNumber = input.nextInt();

	System.out.print("Enter four number: ");
	int fourthNumber = input.nextInt();

	System.out.print("Enter five number: ");
	int fifthNumber = input.nextInt();

	if (firstNumber > secondNumber && firstNumber > thirdNumber && firstNumber > fourthNumber && firstNumber > fifthNumber){largestNumber = firstNumber;}
	else if (secondNumber > firstNumber && secondNumber > thirdNumber && secondNumber > fourthNumber && secondNumber > fifthNumber){largestNumber = secondNumber;}
	else if (thirdNumber > firstNumber && thirdNumber > secondNumber && thirdNumber > fourthNumber && thirdNumber > fifthNumber){largestNumber = thirdNumber;}
	else if (fourthNumber > firstNumber && fourthNumber > secondNumber && fourthNumber > thirdNumber  &&  fourthNumber  > fifthNumber){largestNumber =  fourthNumber;}
	else if (fifthNumber > firstNumber && fifthNumber > secondNumber && fifthNumber > thirdNumber  &&  fifthNumber  > fourthNumber){largestNumber =  fifthNumber;}
	
	System.out.printf("LargestNumber is " + largestNumber);
	
	System.out.printf("SmallestNumber is " + smallestNumber);

  	}

}
