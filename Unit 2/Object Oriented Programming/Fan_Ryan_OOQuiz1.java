/**
Name: Ryan Fan
Date: March 2, 2022
Description: OO_Quiz
*/
public class Fan_Ryan_OOQuiz1
{
   public static void main(String[] args)
   {
      //Cookie with packaging
      Cookie cookie1 = new Cookie("Chocolate Chip",100,200, true);
      System.out.println(cookie1.toString());
      System.out.println();
      
      //cookie without packaging
      Cookie cookie2= new Cookie("Chocolate Chip",100,200);
      System.out.println(cookie2.toString());
      //cookie2.eaten(10);
      System.out.println();
      
      //default cookie
      Cookie cookie3 = new Cookie();
      System.out.println(cookie3.toString());
      System.out.println();
      
      //vegetable
      Vegetable vegetable=new Vegetable("Lettuce", 100, 200);
      System.out.println(vegetable.toString());
      System.out.println();
      
      //human
      Human1 human = new Human1("Bob", 300, 90);
      System.out.println(human.toString());
      System.out.println();
      
      //Eat too much of    a vegetable
      human.eat(vegetable,3000);
      System.out.println();
      //Eat cookie and gain energy and weight
      human.eat(cookie2, 50);
      System.out.println();
      //Try to eat packaged cookie
      human.eat(cookie1, 50);
      System.out.println();
   }
}