
package main;

public class linkedList {
    
    Node head;
    
    public void insert(int data) {
        //create new node
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        if(head == null) {
            head =  node;
        }
        else{
            Node n = head;
            while(n.next !=null) {
                n = n.next;
            }
            n.next = node;
        }
    }
    
    public void show() {
        
        // create variable to monitor node when we tansverse
        Node node = head;
        
        while(node.next != null) {
            //print
            System.out.println(node.data);
            //move to next index after printing
           node = node.next;
        }
        System.out.println(node.data);
    }
    
    //implement a method to inset at specific index
    public void insertAtStart( int data){
      
        //create new node
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
        
    }
    
    public void insertAt(int index, int data ) {
        
        //create new node
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        if(index ==0) {
            insertAtStart(data);
        }
        else{
        Node n = head;
        for(int i=0; i< index-1; i++) {
            n = n.next;
        }
        node.next = n.next;
        n.next = node;
        }
    }
    
   
}
