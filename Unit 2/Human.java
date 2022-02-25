public class Human
{
   //attributes
   /**the name of the person*/
   private String name;
   /**The weight of the person*/
   private double weight;
   /**The energy level of the person*/
   private double energyLevel;
   /** the persons age*/
   private double age;
   /**the persons height*/
   private double height;
   
   /**
   Human
   Creates a human with attributes
   @param name the name of the human
   @param weight the weight of the human
   @param energyLevel the amount of energy the human has
   @param age the age of the human
   @param height the height of the human
   */
   public Human(String name, double weight, double energyLevel, double age, double height)
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
      
      if(age<0)
      {
         this.age=0;
      }
      else
      {
         this.age=age;
      }
      
      if(height<0)
      {
         this.height=1;
      }
      else
      {
         this.height=height;
      } 
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
   Changes the age of the person
   */
   public void setAge(double newAge)
   {
      if(age<0)
      {
         this.age=0;
      }
      else
      {
         this.age=newAge;
      }
   }
   /**
   Changes the height of the person
   */
   public void setHeight(double newHeight)
   {
      if(height<0)
      {
         this.height=1;
      }
      else
      {
         this.height=newHeight;
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
      this.energyLevel=energyLevel-km*0.1;
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
   /**acccesor
   returns all the attributes in a string
   */
   public String toString()
   {
      return "Name: " + this.name + "\nAge: "+ this.age+ " Years\nWeight: "+this.weight+"kg\nEnergy Level: "+ this.energyLevel+"%\nHeight: "+ this.height+"cm";
   }
   
}