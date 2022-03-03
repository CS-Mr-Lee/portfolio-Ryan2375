/**
Name: Ryan Fan
Date: March 2, 2022
Description: Creates a vegetable
*/
public class Vegetable
{
   /**The name of the vegetable*/
   private String name;
   /**The weight of the vegetable*/
   private double weight;
   /**The amount of calories of the vegetable*/
   private int calories;
   
   /**
   Vegetable
   Default constructor
   */
   public Vegetable()
   {
      this.name ="";
      this.weight=-1;
      this.calories=-1;
   }
   /**
   Vegetable
   @param name The name of the vegetable
   @param weight The weight of the vegetable
   @param calories Amount of calories the vegetable has
   */
   public Vegetable(String name, double weight, int calories)
   {
      this.name = name;
      if(this.weight<0){
         this.weight=0;
      }
      else{
         this.weight=weight;
      }
      
      if(this.calories<0){
         this.calories=0;
      }
      else{
         this.calories=calories;
      }
   }
   /**
   @param weight The weight of the vegetable that was eaten
   */
   public void eaten(double weight)
   {
      int calories1=calories;
      if(weight>this.weight)
      {
         this.weight=-1;
         this.calories=-1;
         System.out.println("I don't have that much food");
      }
      else
      {
         this.calories =(int)(weight*(calories)/this.weight);
         this.weight=this.weight-weight;
      }
      
      int calories2=calories1-this.calories;
     
   }
   //accesor
   public int getCalories(){
      return this.calories;
   }
   /**
   acccesor
   returns all the attributes in a string
   */
   public String toString()
   {
      return("Name: "+this.name+"\nWeight:"+this.weight+"\ncalories:"+this.calories);
   }
}