package com.neosoft.basics;

public class DoublyLinkedList {
	class Node{  
        int item;  
        Node prev;  
        Node next;  
   
        public Node(int item) {  
            this.item = item;  
        }  
    }  
    
    //Initially, head and tail is set to null
    Node head, tail = null;  
   
    //Add a node to the list  
    
    public void addNode(int item) {  
        
    	//Create a new node  
        Node newNode = new Node(item);  
   
        //if list is empty, head and tail points to newNode  
        
        if(head == null) {  
            head = tail = newNode;  
            //head's previous will be null  
            head.prev = null;  
            //tail's next will be null  
            tail.next = null;  
        }  
        else 
        {  
            //add newNode to the end of list. tail->next set to newNode  
            tail.next = newNode;  
            //newNode->previous set to tail  
            newNode.prev = tail;  
            //newNode becomes new tail  
            tail = newNode;  
            //tail's next point to null  
            tail.next = null;  
        }  
    }  
   
    //print all the nodes of doubly linked list  
    public void printNodes() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("Doubly linked list is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
            //Print each node and then go to next.  
            System.out.print(current.item + " ");  
            current = current.next;  
        }  
    }  

    public static void main(String[] args) {  
        
        DoublyLinkedList dl = new DoublyLinkedList();  
        
        //Add nodes to the list  
        
        dl.addNode(10);  
        dl.addNode(20);  
        dl.addNode(30);  
        dl.addNode(40);  
        dl.addNode(50); 
   
        //print the nodes 
        dl.printNodes();  
    }  

}
