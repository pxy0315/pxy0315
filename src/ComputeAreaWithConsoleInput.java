import java.util.Scanner;//scanner is in the java.util package
public class ComputeAreaWithConsoleInput {

	public static void main(String[] args) {
		//create a Scanner object 
		Scanner input = new Scanner(System.in);
		
		//prompt the user to enter a radius
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();
		
		//Compute area
		double area = radius * radius *3.14159;
		
		//Display results
		System.out.println("The raea for the circle of radius "+
		radius + " is " + area);

	}

}
