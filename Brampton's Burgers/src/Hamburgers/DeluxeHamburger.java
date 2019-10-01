package Hamburgers;

import java.util.HashMap;

/**
 *
 * @author tarishipandya
 */
public class DeluxeHamburger extends Hamburgers{
    
    public DeluxeHamburger(String breadRoll, String meat, Double price) {
        super(breadRoll, meat, price, 0);
        
    }
    
    @Override
    public void addExtras(String sidesName, String sidesPrice){
        System.out.println("You cannot add anything to Deluxe Hamburger.");
    }
    
    public void addCombo(){
        sides = new HashMap<>();
        sides.put("Chips", "1.49");
        sides.put("Drinks", "2.99");
    }
    
    
    
    
}
