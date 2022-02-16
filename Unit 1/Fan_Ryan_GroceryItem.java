/*Name: Ryan Fan
  Date: Feb 15, 2022
  Description: Grocery item
*/
import java.util.Scanner;
public class Fan_Ryan_GroceryItem
{
   public static void main(String[] args)
   {
      //variables
      String grocery1;
      String grocery2;
      double price1;
      double price2;
      Scanner in = new Scanner(System.in);
      //input
      System.out.println("What is Grocery item 1?");
      grocery1 = in.nextLine();
      System.out.println("What is the price?");
      price1 = in.nextDouble();
      in.nextLine();
      System.out.println("What is Grocery item 2?");
      grocery2 = in.nextLine();
      System.out.println("What is the price?");
      price2 = in.nextDouble();
      //output
      System.out.println("--------------------------");
      System.out.printf("%-20s", grocery1);
      System.out.printf("$%.2f ",price1);
      System.out.printf("\n%-20s", grocery2);
      System.out.printf("$%.2f ",price2);
      System.out.println("\n--------------------------");
   }
}