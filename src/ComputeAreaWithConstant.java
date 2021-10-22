import java.util.Scanner;//scanner is in the java.util package
public class ComputeAreaWithConstant {

	public static void main(String[] args) {
		final double PI = 3.14159;//Declear  a constant
		
		//create a Scanner object 
		Scanner input = new Scanner(System.in);
				
		//prompt the user to enter a radius
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();
				
		//Compute area
		double area = radius * radius * PI;
				
		//Display results
		System.out.println("The raea for the circle of radius "+
		radius + " is " + area);

	}

}
