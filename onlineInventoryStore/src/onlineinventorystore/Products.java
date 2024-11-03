
package onlineinventorystore;

import java.util.ArrayList;
public class Products {
    
    //create attributes of the class product
     String productName;
     int value;
     int shelfNo;
    
     //create arraylist to store products
    ArrayList<Object> product = new ArrayList<>();
   
    //implement the method to add products
    public void addProducts(String productName1,int value1,int shelfNo1){
      
        //assign values eneterd to the add products method
        productName = productName1;
        value = value1;
        shelfNo = shelfNo1;
        
        product.add(productName);
        product.add(value);
        product.add(shelfNo);
        
        
    }
    
    //implement the method to display products added
    public void display(){
        
       for(Object values: product){
           
           System.out.println(values);
       }
        System.out.println();
    }
}
