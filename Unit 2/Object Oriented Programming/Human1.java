/**
Name: Ryan Fan
Date: March 2, 2022
Description: Creates a human
*/
public class Human1
{
   //attributes
   /**the name of the person*/
   private String name;
   /**The weight of the person*/
   private double weight;
   /**The energy level of the person*/
   private double energyLevel;
   
   /**
   Human
   Creates a human with attributes
   @param name the name of the human
   @param weight the weight of the human
   @param energyLevel the amount of energy the human has
   */
   public Human1(String name, double weight, double energyLevel)
   {
      this.name = name;
      if(energyLevel<0)
      {
         this.energyLevel=0;
      }
      else if(energyLevel>100)
      {
         this.energyLevel=100;
      }
      else
      {
         this.energyLevel=energyLevel;
      }
      
      if(weight<0)
      {
         this.weight=0;
      }
      else
      {
         this.weight=weight;
      }
   }
   /**
   Human
   Default constructer
   */
   public Human1()
   {
      this.name = "";
      this.weight=-1;
      this.energyLevel =-1;
   }
   /**
   Changes the name of the person
   */
   public void setName(String newName)
   {
      this.name=newName;
   }
   /**
   Changes the weight of the person
   */
   public void setWeight(double newWeight)
   {
      if(weight<0)
      {
         this.weight=0;
      }
      else
      {
         this.weight=newWeight;
      }
   }
   /**
   Changes the energy level of the person
   */
   public void setEnergyLevel(double newEnergyLevel)
   {
      if(energyLevel<0)
      {
         this.energyLevel=0;
      }
      else if(energyLevel>100)
      {
         this.energyLevel=100;
      }
      else
      {
         this.energyLevel=newEnergyLevel;
      }
   }

   /**
   Changes the energy level based on sleep
   @param hours number of hours slept
   */
   public void sleep(int hours)
   {
      this.energyLevel= energyLevel+hours*10;

      if (energyLevel>100)
      {
         this.energyLevel=100;
      }
      System.out.println("Energy level after sleeping for "+hours+" hours: "+this.energyLevel+"%");
   }
   /**
   Changes the weight and energy based on how far the person has ran
   @param km number of kilometres ran
   */
   public void run(double km)
   {
      this.weight= weight-km*0.001;
      this.energyLevel=energyLevel-km*0.03;
      if (weight<0)
      {
         this.weight=0;
      }
      if(energyLevel<0)
      {
         this.energyLevel=0;
      }
      System.out.println("Energy Level after run:" +this.energyLevel+"%\nWeight after run:"+ this.weight+"kg");
      
   }
   /**
   Eats a vegetable and gains weight and calories
   */
   public void eat(Vegetable veg, double grams)
   {
      veg.eaten(grams);
      if(veg.getCalories()==-1)
      {
         this.energyLevel=energyLevel;
         this.weight=weight;
      }
      else{
         this.weight=weight+grams/1000;
         this.energyLevel=energyLevel+veg.getCalories()/15;
         if(this.energyLevel>100){
            this.energyLevel=100;
         }
      
         else{
            this.energyLevel=energyLevel;
         }
         System.out.println("Energy level after eating vegetable is "+this.energyLevel);
         System.out.println("Weight after eating vegetable is "+this.weight);
      } 
   }
   /**
   Eats a cookie and gains weight and calories
   */
   public void eat(Cookie food, double grams)
   {
      food.eaten(grams);
      if(food.getCalories()==-1)
      {
         this.energyLevel=energyLevel;
         this.weight=weight;
      }
      else if(food.getWeight()==-2)
      {
         this.energyLevel=energyLevel;
         this.weight=weight;
      }
      else{
         this.weight = weight+grams/1000; //convert g to kg
         this.energyLevel=energyLevel+food.getCalories()/15;
         if(this.energyLevel>100){
            this.energyLevel=100;
         }
         else{
            this.energyLevel=energyLevel;
         }
         System.out.println("Energy level after eating cookie is "+this.energyLevel);
         System.out.println("Weight after eating cookie is "+this.weight);
      }
      
     
            
   }
   /**acccesor
   returns all the attributes in a string
   */
   public String toString()
   {
      return "Name: " + this.name +  "\nWeight: "+this.weight+"kg\nEnergy Level: "+ this.energyLevel;
   }
   
}