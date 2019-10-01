package Hamburgers;

import java.util.Scanner;

/**
 *
 * @author tarishipandya
 */
public class Main {
    
    public static void main(String[] args) {
        
        int option = 0;
        double total = 0.0;
        
        Scanner sc = new Scanner(System.in);
        
        Orders o1 = new Orders();
        
        System.out.println("***************  Brampton's Burgers  ***************");
            
            do{
                System.out.println("-----------------------------------------------------");
                System.out.println("1 Hamburger");
                System.out.println("2 Healthy Burger");
                System.out.println("3 Deluxe Burger");
                System.out.println("4 Exit");

                option = sc.nextInt();
                total = total + o1.order(option);
                
            } while (option < 4);
            if (total > 0.0){
                
                System.out.format("Your bill is: $%.2f\n", total);
                System.out.println("Thank you for ordering with us.");
                
            } else {System.out.println("See you next time.");}
    }
}
