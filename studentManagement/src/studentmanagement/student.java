
package studentmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class student {
    int studentID;
    String name;
    int age;
    
    ArrayList<Object>  list = new ArrayList<>();
    
    public void addStudent(int id,String n,int a) {
        
        studentID = id;
        name = n;
        age = a;
       
        list.add(n);
        list.add(a);
        list.add(id);
        
        
    }
    
    public void viewStudent() {
        
        System.out.println("REGISTERD STUDENTS ARE:");
        for (Object list1 : list) {
            
            System.out.println(list1);
        }
         System.out.println();
        
    }
    
    public void editStudent() {
        
       student student = new student();
       
        Scanner sc = new Scanner(System.in);
        
        //ask the student to enter the name for verification
            System.out.println("ENTER THE NAME OF THE STUDET");
             String studentName = sc.next().toLowerCase();
             
             //use for each loop to check the name
             for(Object list1 : list) {
             
                 //if the name exeists then we display
             if(list1.toString().contains("EMKAY")){
             System.out.println("DO YOU WANT TO EDIT NAME??(ENTER 0 / 1)");
             int choice3 = sc.nextInt();
             
              //if choice == 1 we allow the user to enter new name
             if(choice3 == 1){
                 
                 System.out.println("ENTER THE NEW NAME: ");
                 String name2 = sc.next().toUpperCase();
                 
                 //assign the new anem to the name as the attribute of the class
                 name = name2;
                 
                 //add updated information to stack
                 student.addStudent(studentID, name, age);
                 
                  student.viewStudent();
                
             }
             
            
           
          }
        }
        
    }
}
