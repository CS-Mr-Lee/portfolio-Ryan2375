/**
Name: Ryan Fan
Date: March 24, 2022
Description: animal class*/
public class Animal
{
   /*Attributes
   */
   /**the type of animal*/
   private String type;
   /**the weight of the animal*/
   private double weight;
   /**the size of the animal*/
   private double size;
   /**the colouur of the animal*/
   private String colour;
   
   /**Animal
   Creates a animal with attributes
   @param type the type of the animal
   @param weight the weight of the animal in kg
   @param size the size of the animal in cm
   @param colour the colour of the animal
   */
   public Animal(String type, double weight, double size, String colour)
   {
      this.type=type;
      this.weight=weight;
      this.size=size;
      this.colour=colour;
   }
   //accesors
   public String getType()
   {
      return this.type;
   }
   public double getWeight()
   {
      return this.weight;
   }
   public double getSize()
   {
      return this.size;
   }
   public String getColour(){
      return this.colour;
   }   
   /**
   Changes the weight based on how much the animal ate
   @param grams the amount of food the animal ate in grams
   */
   public void eat(double grams)
   {
      if(grams<0)
      {
         this.weight=weight;
      }
      else
      {
         this.weight=weight+(grams/1000);
      }
      System.out.println("This "+ type+"'s weight is now "+ this.weight+"kg after eating");
   }
   
   /**
   Changes the weight based on how much the animal ran
   @param km the distance the animal ran
   */
   public void run(double km)
   {
      this.weight=weight-km*0.01;
      System.out.println("This "+type+"'s weight is now "+this.weight+"kg after running");
   }
   /**
   Animal sleeps for a certain amount of time
   @param hours number of hours slept
   */
   public void sleep(int hours)
   {
      System.out.println("This "+type+" slept for "+hours+" hours.");
   }
   
   /**accessor
   returns the animals attributes*/
   public String toString()
   {
      return "Type: "+ this.type+", Weight: "+this.weight+"kg, Size: "+this.size+"cm, Colour: "+ this.colour; 
   }


}