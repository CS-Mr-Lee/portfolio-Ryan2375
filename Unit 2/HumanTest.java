/**
Name: Ryan Fan
Date: Feb 25, 2022
Description: Demonstrating the human class
*/
public class HumanTest
{
   public static void main(String[] args)
   {
      double km=100;
      int hours=8;
      
      //print out first human information using accessor
      Human human1 = new Human("Bob", 300, 100, 90, 200);
      System.out.println(human1.toString());
      
      /*demonstration of run() method
      Shows the new weight and energy level after the run
      */
      System.out.println();
      human1.run(km);
      
      //print out second human information using accesor
      System.out.println();
      Human human2 = new Human("Human 2", 140, 20, 90, 150);
      System.out.println(human2.toString());
      
      /*demonstration of sleep() method
      Shows the new energy level after sleeping for a certain amount of time
      */
      System.out.println();
      human2.sleep(hours);
      
      /*Demonstration of mutators
      The mutators changes the attributes of human 2
      */
      System.out.println();
      human2.setName("New name");
      human2.setWeight(100);
      human2.setEnergyLevel(0);
      human2.setAge(200);
      human2.setHeight(100);
      System.out.println(human2.toString());
     
   }
}