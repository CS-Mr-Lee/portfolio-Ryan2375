/**
Name: Ryan Fan
Date: March 24, 2022
Description: Dog class
*/
public class Dog extends Animal
{
   //Attributes
   /**is the dog friendly*/
   private boolean isFriendly;
   /**Dog
   Creates a dog with attributes
   @param type the type of dog
   @param weight the weight of the dog in kg
   @param size the size of the dog in cm
   @param colour the colour of the dog
   @param isFriendly whether the dog is friendly*/
   public Dog(String type, double weight, double size, String colour, boolean isFriendly){
      super(type, weight, size, colour);
      this.isFriendly=isFriendly; 
   } 
   /**accesor*/
   public boolean getIsFriendly()
   {
      return this.isFriendly;
   }
   /**Makes the dog bark*/
   public void bark()
   {
      System.out.println("This dog barks!");
   }
   /**accessor
   returns the dogs attributes*/
    public String toString()
   {
      return super.toString()+ ", Friendly: "+this.isFriendly; 
   }

}