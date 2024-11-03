
package onlineinventorystore;

import java.util.Scanner;

public class OnlineInventoryStore {

  //write code which allow the user to add products and store them on the linkedlist  
    public static void main(String[] args) {
        
       Products product = new Products();
       
        Scanner sc = new Scanner(System.in);
        
        //ask the user if they want to add product
        System.out.println("DO YOU WANT TO ADD PRODUCTS???");
        String choice = sc.next().toLowerCase();

        //ask the user the number of products they want to add
        System.out.println("HOW MANY PRODUCTS YOU WANNA ADD PRODUCTS???");
        int number = sc.nextInt();
        if(choice.equalsIgnoreCase("yes")){

            //if the condition is met this loop we loop for the specified number
            for(int i=0; i< number; i++){
                System.out.println("ENTER NAME OF PRODUCT");
                String name = sc.next().toUpperCase();
                
                System.out.println("ENTER price OF PRODUCT");
                int price = sc.nextInt();
                
                System.out.println("ENTER SHELF TO STORE PRODUCTS");
                int shelf = sc.nextInt();

                //we all the add method to add products on the arraylist
                product.addProducts(name, price,shelf);
            }

            //we ask the user if they want to check if the products are added
            System.out.println("DO YOU WANNA CHECK IF THE PRODUCTS ARE ADDED???");
            String choice3 = sc.next().toLowerCase();

            //if yes we call display method
            if(choice.equalsIgnoreCase("yes")){
                
                product.display();
            }
            
            
            
        }
        else{
            
            System.out.println("YOU HAVE NO ACTIVITY TO DO");
            System.out.println("THANK YOU");
        
    }
    
}
