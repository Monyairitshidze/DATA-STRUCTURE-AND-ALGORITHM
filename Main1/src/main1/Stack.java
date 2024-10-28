
package main1;

import java.util.Arrays;
import java.util.Scanner;
//write code to implement stack using array

//create a abstract class having push,pop and peek method
abstract class Stack {
    
    public void push(){
        
    }
    public void pop(){
        
    }
    public void peek(){
        
    }
    
}

//use array calss to extend stack
  class Array extends Stack{
     
    Scanner sc = new Scanner(System.in);
    
    //create array of sizze 4
    int array[] = new int[4];
    
    //create variable index that monitors addition of ellements in the array
    int index =0;
    public int push(int data){
   
        //use conditional statement to insert ellements in the array
        if(index<array.length) {
            
            array[index++] = data;
            return 1;
        }
        System.out.println("STACK IS FULL");
        return -1;
    }
    
    
    //implement peek method which return first ellement of the array
    @Override
    public void peek(){
      
         System.out.print("PEEKED ELEMENT IS: "+array[0]+ " ");
            
         System.out.println();
      
    }
    
    //implement the pop method that retrun the deleted element
    @Override
    public void pop(){
       
       if(index>0){
           System.out.print("DELETED ELEMENT IS: " + array[--index]);
           
           //assignt the length of array to index
           index = array.length-1;
           //copy origional array to another array
            int array1[] = Arrays.copyOf(array, index);
           System.out.println();
           
           //print the values of the new array
           for(int values: array1){
               System.out.print(values+ " ");
           }
           System.out.println();
       }
       
       else{
             System.out.println("THE STACK IS EMPTY");
       }
    }
   
}
