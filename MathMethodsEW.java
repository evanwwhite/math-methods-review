//Evan White
import java.util.Scanner;
import static java.lang.System.*;

  public class MathMethodsEW {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int choice = -1;
		double max = 0;
		do
		{
			out.print("Choose from the following menu :: \n");
			out.print(" 1] Surface area of a cube \n" +
	              " 2] Area of a circle     \n" +
	              " 3] Minimum of 2 numbers \n" +
	              " 4] Maximum of 3 numbers  \n" +
	              "-1] Quit ==>> ");
			choice = input.nextInt();

			if(choice == 1)
			{
				out.println("Surface area of a cube\n");
                out.println("What is the length of one side : ");
                double SideLength = input.nextDouble();
                out.println(Math.pow(SideLength,2)* 6);
			}

			if(choice == 2)
			{
				out.println("Area of a circle\n");
                out.println("What is the radius : ");
                double Radius = input.nextDouble();
                out.println(Math.pow(Radius,2)* Math.PI);
			}

			if(choice == 3)
			{
				out.println("Minimum of 2 numbers\n");
                out.println("What is the first number : ");
                double num1 = input.nextDouble();
                out.println("What is the second number : ");
                double num2 = input.nextDouble();
                out.println(Math.min(num1, num2));
			}

			if(choice == 4)
			{
				out.println("Maximum of 3 numbers\n");
                out.println("What is the first number : ");
                double number1 = input.nextDouble();
                out.println("What is the second number : ");
                double number2 = input.nextDouble();
                out.println("What is the third number : ");
                double number3 = input.nextDouble();
                max = (Math.max(number1,number2));
                out.println(Math.max(max, number3));
			}

		}while (choice != -1);

		out.println();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
