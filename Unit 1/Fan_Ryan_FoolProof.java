/*Name: Ryan Fan
  Date: Feb 15, 2022
  Description: foolproof
*/
import java.util.*;
public class Fan_Ryan_FoolProof
{
   public static void main(String[] args)
   {
      //variables
      Scanner in = new Scanner(System.in);
      String numerator="0";
      String denominator="1";
      double num,den;
      double quotient=0;
      
      boolean program = true;
      //while loop to keep the program running until user enters q
      while(program == true)
      {
         try
         {
            //input
            System.out.print("Enter the numerator: ");
            numerator = in.nextLine();
            num = Double.parseDouble(numerator);
            System.out.print("Enter the denominator: ");
            denominator = in.nextLine();
            den = Double.parseDouble(denominator);
            //check if user entered q
            if(numerator.equals("q"))
            {
               program = false;
            }
            if(denominator.equals("q"))
            {
               program = false;
            }
            //prevent user from entering 0
            if(den==0)
            {
               while(den==0)
               {
                  System.out.println("You entered can't divide "+ numerator+ " by zero ");
                  System.out.print("Please try again: ");
                  denominator = in.nextLine();
                  den = Double.parseDouble(denominator);
               }
            }
            quotient = num/den;
            System.out.printf(num +"/"+ den+ " is %.2f\n", quotient);
         }
         //catch errors
         catch(InputMismatchException e)
         {
            System.out.println("You entered bad data. Please try again");
            in.nextLine();
         }
         catch(NumberFormatException e)
         {
            if(numerator.equals("q"))
            {
               program = false;
            }
            else if(denominator.equals("q"))
            {
               program = false;
            }
            else
            {
               System.out.println("You entered bad data. Please try again");
            }
         }
      }
   }
}