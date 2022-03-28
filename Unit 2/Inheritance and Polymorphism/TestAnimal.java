/**
Name: Ryan Fan
Date: March 24, 2022
Description: TestAnimal
*/
public class TestAnimal
{
   public static void main(String []args)
   {
      
      Dog myDog= new Dog("Small Dog", 50,100,"red", false);
      Cat myCat= new Cat("Cat 1", 20,600,"red", false);
      
      System.out.println(myDog);
      System.out.println(myCat);
      System.out.println();
      //demo of class functions for dog
      myDog.eat(100);
      myDog.run(2);
      myDog.sleep(10);
      myDog.bark();
      System.out.println();
      //demo of class functions for cat
      myCat.eat(500);
      myCat.run(20);
      myCat.sleep(5);
      myCat.die();
   
      //polymorphism           
      Animal[] myAnimals= new Animal[4];
      myAnimals[0] = new Dog("Dog", 100, 100, "Blue",true);
      myAnimals[1] = new Cat("Cat", 20, 30, "Black", true);
      myAnimals[2]= new Cat("Fat Cat", 40, 250, "Orange", true);
      myAnimals[3] =  new Dog("Dog 2", 100, 100, "Blue",true);
      
      for(int i =0; i<myAnimals.length;i++){
         System.out.print("\n");
         System.out.println(myAnimals[i]);
         
         if(myAnimals[i] instanceof Dog)
         {
            ((Dog)myAnimals[i]).bark();
         }
         else if(myAnimals[i] instanceof Cat) 
         {
            ((Cat)myAnimals[i]).die();
         }
      }
   }
}