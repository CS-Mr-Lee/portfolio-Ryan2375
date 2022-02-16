/*Name: Ryan Fan
  Date: Feb 15, 2022
  Description: SAS triangle solver
*/
import java.util.Scanner;
import java.lang.Math;
public class Fan_Ryan_SASTriangleSolver
{
   public static void main(String[] args)
   {
      //vairables
      double sideB;
      double sideC;
      double angleA;
      Scanner in = new Scanner(System.in);
      //input
      System.out.println("Enter side number 1: ");
      sideB = in.nextDouble();
      System.out.println("Enter side number 2: ");
      sideC = in.nextDouble();
      System.out.println("Enter the angle in radians: ");
      angleA = in.nextDouble();
      //output
      System.out.print("The smallest angle is ");
      System.out.printf("%.2f degrees",smallestAngle(sideB, sideC, angleA));
   }
   //method to return the smallest angle
   public static double smallestAngle(double sideB, double sideC, double angleA)
   {
      //variables
      double smallestSide;
      double SASTriangle=0;
      smallestSide= sideB;
      double smallestAngle = angleA;
      double sideA= Math.sqrt(Math.pow(sideB,2)+Math.pow(sideC,2)-2*sideB*sideC*Math.cos(angleA));
     //if statement to fine smallest angle
      if(sideC<smallestSide)
      {
         smallestSide = sideC;
         
         SASTriangle= Math.asin(sideC*Math.sin(angleA)/sideA);
      }
      if(sideA<smallestSide)
      {
         smallestSide= sideA;
         SASTriangle= angleA;
      }
      if(sideB==smallestSide)
      {
         SASTriangle= Math.asin(sideB*Math.sin(angleA)/sideA);
      }
      smallestAngle= Math.toDegrees(SASTriangle);
      return smallestAngle;
   }
}