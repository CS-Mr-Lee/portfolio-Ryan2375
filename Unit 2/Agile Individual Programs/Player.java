/**
Name: Ryan
Date: May 3, 2022
player class
*/
public class Player{
   
   private String username;
   private int kills;
   private int assists;
   private int deaths;
   private boolean isAlive;
   private double utilDamage;
   private double adr;
   private boolean hasKit;
   private boolean isT;
   private boolean isCt;
   private double armorlvl;
   private boolean hasHelmet;
   private double hp;
   private double money;
   private double hsPercent;
   private int skill;
   private int t;
   private int ct;
   private Round round;
   
   public Player(String username,int kills, int assists,int deaths, boolean isAlive,double utilDamage, double adr, boolean hasKit, boolean isT,boolean isCt, double armorlvl, boolean hasHelmet, double hp,double money, double hsPercent, int skill,int t, int ct){
      this.kills=kills;
      this.username=username;
      this.assists=assists;
      this.deaths=deaths;
      this.isAlive=isAlive;
      this.utilDamage=utilDamage;
      this.adr=adr;
      this.hasKit=hasKit;
      this.isT=isT;
      this.isCt=isCt;
      this.armorlvl=armorlvl;
      this.hasHelmet=hasHelmet;
      this.hp=hp;
      this.money=money;
      this.hsPercent=hsPercent;
      this.skill=skill;
      this.t=round.getTsAlive();
      this.ct=round.getCtsAlive();

   }
   
   public String getUsername(){
      return this.username;
   }
   public int getKills(){
      return this.kills;
   }
   public int getAssists(){
      return this.assists;
   }
   public int getDeaths(){
      return this.deaths;
   }
   public double getUtilDamage(){
      return this.utilDamage;
   }
   public double getAdr(){
      return this.adr;
   }
   public boolean getIsAlive(){
      return this.isAlive;
   }
   public boolean getHasKit(){
      return this.hasKit;
   }
   public boolean getIsT(){
      return this.isT;
   }
   public boolean getIsCt(){
      return this.isCt;
   }
   public boolean getHasHelmet(){
      return this.hasHelmet;
   }
   public double getHp(){
      return this.hp;
   }
   public double getMoney(){
      return this.money;
   }
   public double gethsPercent(){
      return this.hsPercent;
   }
  public int skill(){
      return this.skill;
   }


   public void killEnemy(){
      this.kills=this.kills+1;
      System.out.println("Kill!");
      //Demonstration of dependent on one of my own classes, when you kill someone, it lowers the player count on the enemy team. The playercount is taken from the class Round.java
      if(isT==true)
      {
         this.ct=this.ct-1;
      }
      else
      {
         this.t=this.t-1;
      }
   }
   public void assistTeam(){
      this.assists=this.assists+1;
      System.out.println("Assist!");
   }
   public void die(){
      this.deaths=this.deaths+1;
      System.out.println("You died!");
   }
   
   public String toString(){
      return "Username: "+this.username+"\nKills: "+this.kills+ "\nAssists: "+this.assists+"\nDeaths: "+this.deaths+"\nAlive?: "+this.isAlive+"\nutilDamage: "+this.utilDamage+"\nadr:"+this.adr+"\nhasKit: "+this.hasKit+"\nisT: "+this.isT+"\nisCt: "+this.isCt+"\narmorlvl: "+this.armorlvl+"\nhas helmet: "+this.hasHelmet+"\nhp: "+this.hp+"\nmoney: "+this.money+"\nhsPercent: "+this.hsPercent+"\nskill: "+skill+"\nNumber of t alive: "+this.t+"\nNumber of ct alive: "+this.ct;
   }

}