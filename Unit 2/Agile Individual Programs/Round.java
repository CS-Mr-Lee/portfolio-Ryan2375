/**
* name: Ryan
* date: April 30, 2022
* description: rounds class for csgo
*/
public class Round{
  /*Attributes
  */
  /**Whether the bomb is planted*/
  private boolean isBombPlanted;
  /**Whether the bomb is defused*/
  private boolean isBombDefused;
  /**If there's time left*/
  private boolean isTimeRunOut;
  /**If the ct team wins*/
  private boolean ctWin;
  /**If the t team wins*/
  private boolean tWin;
  /**How many t alive*/
  private int tsAlive;
  /**How many ct alive*/
  private int ctsAlive;
  /**Variable to get info from the Map class*/
  private Map map;
  
  /**Round
  Creates a round
  @param isBombPlanted Whether the bomb is planted
  @param isBombDefused Whether the bomb is defused
  @param isTimeRunOut If there's time left
  @param ctWin If the ct team wins
  @param tWin If the t team wins
  @param tsAlive How many t alive
  @param ctsAlive How many ct alive
  */ 
  public Round(boolean isBombPlanted,boolean isBombDefused,boolean isTimeRunOut, boolean ctWin, boolean tWin,int tsAlive, int ctsAlive)
 {
    this.isBombPlanted=false;
    this.isBombDefused=false;
    this.isTimeRunOut=false;
    this.ctWin=false;
    this.tWin=false;
    this.tsAlive=5;
    this.ctsAlive=5;
  }
 
  //Accessors
  public boolean getIsBombPlanted(){
    return this.isBombPlanted;
  }
  public boolean getIsBombDefused(){
    return this.isBombPlanted;
  }
  public boolean getIsTimeRunOut(){
    return this.isTimeRunOut;
  }
  public boolean getCtWin(){
    return this.ctWin;
  }
  public boolean getTWin(){
    return this.tWin;
  }
  public int getTsAlive(){
    return this.tsAlive;
  }
  public int getCtsAlive(){
    return this.ctsAlive;
  }

  /**Plants the bomb*/
  public void plant(){
    this.isBombPlanted=true;
    System.out.println("The bomb is planted");
  }
  
  /**Defuses the bomb*/
  public void defuse(){
    this.isBombDefused=true;
    System.out.println("The bomb is defused");
  }
  
  /**Returns the round attributes*/
  //Demonstration of dependence on another class. As it returns the map name which is from Map.java
  public String toString(){
    return "Bomb Planted: "+ this.isBombPlanted+"\n Bomb Defused: "+ this.isBombDefused+"\n Time RunOut: "+this.isTimeRunOut+ "\nctWin: "+this.ctWin+"\ntWin: "+this.tWin+"\ntsAlive: "+this.tsAlive+"\nctsAlive: "+this.ctsAlive+"MaP: "+ map.getName();
  }
}
