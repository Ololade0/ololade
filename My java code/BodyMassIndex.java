import java.util.Scanner;
    public class BodyMassIndex {
 	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter weight in pounds");
	double weightInPounds = input.nextDouble();

	System.out.print("Enter height in inches");
	double heightInInches = input.nextDouble();


	double weightKg = (weightInPounds * 0.45359237);
        System.out.printf("weightKg is %f", weightKg);

	double heightInMetre = (heightInInches * 0.0254);
	System.out.printf("heightInMetre is %f", heightInMetre);
	
	double BMI = weightKg / (heightInMetre * heightInMetre);
	System.out.printf("Body in mass is %f", BMI);   

	
  }

}

	
	