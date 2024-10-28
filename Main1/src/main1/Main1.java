
package main1;


public class Main1 {

    public static void main(String[] args) {
       
        //create instance of the array
        Array array = new Array();
        //call push method to insert ellemnt
        array.push(1);
        array.push(10);
        array.push(8);
        array.push(78);
        
        
       System.out.println("ENTERD ELLEMNTS ARE: ");
       for(int values: array.array){
           
           System.out.print(values+" ");
       }
       System.out.println();
       
       //call a peek ellemnt to return the first ellemnt to be enterd
       array.peek();
       
       //call a pop method to remove last elemnt int the index
       array.pop();
              
    }
   
    
    
}
