/**
Name: Ryan Fan
Date: March 2, 2022
Description: Creates a cookie
*/
public class Cookie{
   /** The name of the cookie*/
   private String name;
   /** The weight of the cookie*/
   private double weight;
   /**The amount of calories*/
   private int calories;
   //**Whether the cookie is packaged*/
   private boolean isPackaged;
   
   /**
   Cookie
   Default values
   */
   public Cookie(){
      this.name="";
      this.weight =-1;
      this.calories=-1;
      this.isPackaged=false;
   }
   
   /**
   Cookie
   @param name The name of the cookie
   @param weight The weight of the cookie
   @param calories Amount of calories the cookie has
   */
   public Cookie(String name, double weight, int calories)
   {
      this.name=name;
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
   Cookie
   @param name The name of the cookie
   @param weight The weight of the cookie
   @param calories Amount of calories the cookie has
   @param isPackaged Check if the cookie is packaged
   */
   public Cookie(String name, double weight, int calories, boolean isPackaged)
   {
      this.name=name;
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
      this.isPackaged=isPackaged;
   }
   /**
   Opens the package
   */   
   public void open(){
      this.isPackaged=false;
   }
   /**
   @param weight The weight of the cookie that was eaten
   */   
   public void eaten(double weight)
   {
      int calories1= calories;
      if(isPackaged==false)
      {
         if(weight>this.weight)
         {
            this.weight=-1;
            this.calories=-1;
            System.out.println("I don't have that much food");
         }
         else
         {
            this.calories =(int)(this.calories-(weight*(calories)/this.weight));
            this.weight=this.weight-weight;
         }
      }
      else
      { 
         this.weight=-2;
         System.out.println("I can't eat the bag");
            
      }
      int calories2=calories1-this.calories;  
      System.out.println("Calories eaten is:" +(calories2));
   }
   public int getCalories(){
      return this.calories;
   }
   public double getWeight(){
      return this.weight;
   }
   /**
   acccesor
   returns all the attributes in a string
   */
   public String toString()
   {
      return("Name: "+this.name+"\nWeight:"+this.weight+"\ncalories:"+this.calories+"\nPackaged:"+isPackaged);
   }
   
}