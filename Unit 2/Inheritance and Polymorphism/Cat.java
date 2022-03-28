/**
Name: Ryan Fan
Date: March 24, 2022
Description: cat class
*/
public class Cat extends Animal
{
   //Attrubutes
   /**Does the dog have claws*/
   private boolean hasClaws;
   
   /**Cat
   Creates a cat with attributes
   @param type the type of the cat
   @param weight the weight of the cat in kg
   @param size the size of the cat in cm
   @param colour the colour of the cat
   @param hasClaws whether the cat has claws
   */
   public Cat(String type, double weight, double size, String colour, boolean hasClaws){

      super(type,weight, size, colour);
      this.hasClaws=hasClaws; 
   } 
   /**Accesor*/
   public boolean getHasClaws()
   {
      return this.hasClaws;
   }
   /**The cat dies*/
   public void die()
   {
      System.out.println("This cat died!");
   }
   /**accessor
   returns the cats attributes*/
   public String toString()
   {
      return super.toString()+ ", Claws: "+this.hasClaws; 
   }
}