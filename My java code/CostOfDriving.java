import java.util.Scanner;
    public class CostOfDriving {
 	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the driving distance");
	double drivingDistance = input.nextDouble();

	System.out.print("Enter miles of gallon");
	double milesOfGallon = input.nextDouble();

	System.out.print("Enter the price per gallon");
	double pricePerGallon = input.nextDouble();

	double cost = (drivingDistance / milesOfGallon) * pricePerGallon; 

        System.out.printf("The cost of driving is %f", cost);

	
  }

}

	
	