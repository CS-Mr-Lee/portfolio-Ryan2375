/*Name: Ryan Fan
  Date: Feb 15, 2022
  Description: Champion filter
*/
import java.io.*;
public class Fan_Ryan_ChampionsFilter1
{
   public static void main(String[] args)
   {
      //variables
      int highestHP=0;
      String name;
      String hpName1= " ";
      String armorName1= " ";
      String fileName1= "MaxChampStats.txt";
      int lowestArmor =9999999;
      String fileName="champions.txt"; 
      String lineIn;
      try
      {
         //read from file
         BufferedReader in = new BufferedReader(new FileReader(fileName));
         lineIn= in.readLine();
         while(lineIn!=null)
         {
            try
            {
               //if statement to get the name
               if(lineIn.contains("name"))
               {
                  name = lineIn;
                  lineIn=in.readLine();
                  while(!lineIn.contains("name"))
                  {
                     //if statement to get hp/armor amount
                     if(lineIn.contains("\"hp\": "))
                     {
                        System.out.println(lineIn.substring(12,15));
               
                        if(highestHP<=Integer.parseInt(lineIn.substring(12,15)))
                        {
                           hpName1= name;
                           highestHP=Integer.parseInt(lineIn.substring(12,15));
                        }
                     }
                     if(lineIn.contains("\"armor\": "))
                     {
                        System.out.println(lineIn.substring(15,17));
                        if(lowestArmor>=Integer.parseInt(lineIn.substring(15,17)))
                        {
                           armorName1=name;
                           lowestArmor=Integer.parseInt(lineIn.substring(15,17));
                        }
   
                     }
                     lineIn=in.readLine(); 
                  }
               }
            }
            catch(NullPointerException e)
            {
            }    
            lineIn = in.readLine();
         }
         in.close();
      }
      catch(IOException e)
      {
         System.out.println("Error, cannot read file.");
      }
      //writer
      try
      {
         BufferedWriter out = new BufferedWriter(new FileWriter(fileName1, false));
         out.write("highest hp is "+ highestHP);
         out.newLine();
         out.write(hpName1);
         out.newLine();
         out.write("lowest armor is "+ lowestArmor);
         out.newLine();
         out.write(armorName1);
         out.close();
      }
      catch(IOException e)
      {
      }
      System.out.println("highest hp is "+ highestHP);
      System.out.println(hpName1);
      System.out.println("lowest armor is "+ lowestArmor);
      System.out.println(armorName1);
      
   }
}