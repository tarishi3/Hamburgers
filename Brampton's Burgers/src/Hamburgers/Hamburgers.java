package Hamburgers;


import java.util.*;

/**
 *
 * @author tarishipandya
 */
public class Hamburgers {
    
    private String breadRoll;
    private String meat;
    private Double price;
    private String name;
    private int extrasCount;
    
    public Map<String, String> sides = new HashMap<>();
    
    public Hamburgers(String breadRoll, String meat,Double price, int extras){
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.price = price;
        this.extrasCount = extras;
    }
    
    public void setName(String value){
        this.name = value;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getExtrasCount(){
        return this.extrasCount;
    }
    
    public void addExtras(String sidesName, String sidesPrice){
        
        if(sides.size() < this.extrasCount){
            sides.put(sidesName, sidesPrice);
        }
        
    }
    
    public double calculatePrice(){
      double total = this.price;
      double value;
      for (String str : sides.values()){
          value = Double.parseDouble(str);
          total = total + value;
      }
      
      return total;
    }
    
    public void displayFinalPrice(){
        System.out.println(this.getName()+" Burger on a "+this.breadRoll+" with "+this.meat+", price is $"+ this.price);
           
        for (String keys : sides.keySet())
        {
                System.out.println("Added " + keys + " for an extra $" + sides.get(keys));
            
        }
        
        System.out.format("The total price is : $%.2f\n", calculatePrice());
    }
    
    
}
