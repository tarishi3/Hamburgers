package Hamburgers;

import java.util.Scanner;

/**
 *
 * @author tarishipandya
 */
public class Orders {
        
        Scanner sc = new Scanner(System.in);
        
        String[] extras = {"Tomato", "Lettuce", "Onion", "Pickels", "Cheese", "Mushrooms"};
        String[] prices = {"0.49", "0.49", "0.99", "0.49", "1.99", "1.49"};
        String[] meats = {"Sausage", "Beef", "Veggie", "Chicken"};
        
        public int selectMeat(){
            int meatChoice;
            System.out.println("Select Meat of your choice from following options:");
            for (int i = 0; i < meats.length; i++) {
                System.out.println( (i+1) + " " + meats[i]);
            }
            meatChoice = sc.nextInt();
            return meatChoice;
        }
        
        public void addingExtras(Hamburgers ham, int size){
            int a = 0;
            System.out.println("You have option of " + size + " toppings. How many toppings would you like? ");
            a = sc.nextInt();
            if(a <= 4){
                
                System.out.println("Select your toppings from following options:");
                for (int i = 0; i < extras.length; i++) {
                    System.out.println((i+1) + " " + extras[i]);
                }
                while(a > 0){

                   int index = sc.nextInt();
                   ham.addExtras(extras[index - 1], prices[index - 1]);
                   a = a - 1;
                }
                ham.displayFinalPrice();
            } else { a = 0; System.out.println("Please enter value below " + ham.getExtrasCount());}
            
        }
        
        public double order(int option){
            double total = 0.0;
            
            int meat = 0;
            
            switch(option)
                {
                    case 1:
                        meat = selectMeat();
                        Hamburgers ham = new Hamburgers("White roll", meats[meat - 1], 5.49, 4);
                        ham.setName("Basic");
                        addingExtras(ham, ham.getExtrasCount());
                        
                        total = total + ham.calculatePrice();
                        break;
                        
                    case 2:
                        meat = selectMeat();
                        HealthyBurger healthy = new HealthyBurger(meats[meat - 1], 7.49);
                        healthy.setName("Healthy");
                        addingExtras(healthy, healthy.getExtrasCount());
                        total = total + healthy.calculatePrice();
                        break;
                        
                    case 3:
                        meat = selectMeat();
                        DeluxeHamburger deluxe = new DeluxeHamburger("White roll", meats[meat - 1], 15.49);
                        deluxe.setName("Deluxe");
                        deluxe.addCombo();
                        deluxe.displayFinalPrice();
                        total = total + deluxe.calculatePrice();
                        break;
                    case 4: break;    
                    default:
                        System.out.println("Select proper value.");
                        
                }
            return total;
        }
 
    }
