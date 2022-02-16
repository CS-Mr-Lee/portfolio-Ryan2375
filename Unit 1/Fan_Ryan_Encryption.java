/*Name: Ryan Fan
  Date: Feb 15, 2022
  Description: Encryption
*/
import java.util.Scanner;

public class Fan_Ryan_Encryption
{
   public static void main(String[] args)
   {
      //variables
      String sentence;
      char encryption[];
      Scanner in = new Scanner(System.in);
      //input
      System.out.print("Input a string: ");
      sentence = in.nextLine();
      //split the sentence by its space and put it into an array
      String[]words = sentence.split(" ");
      
      encryption=new char[9999];
      System.out.print("Output: ");
      //for loop to excrypt the input
      for (int i =0;i<words.length;i++)
      {
         for(int j = 0;j<words[i].length();j++)
         {
            encryption[j]= words[i].charAt(j);
            encryption[j] +=2;
            encryption[0]= words[i].charAt(words[i].length()-1);
            encryption[words[i].length()-1]=words[i].charAt(0);
            System.out.print(encryption[j]);
         }
         System.out.print(" ");
      }
   }
}