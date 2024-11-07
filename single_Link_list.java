import java.util.Scanner;

public class single_Link_list {

        // Represent a node of the singly linked list
        class Node {
                int data;
                Node next;

                public Node(int data) {
                        this.data = data;
                        this.next = null;
                }
        }

        // Represent the head and tail of the singly linked list
        public Node head = null;
        public Node tail = null;

        // addAtStart() will add a new node to the beginning of the list
        public void addAtStart(int data) {
                // Create a new node
                Node newNode = new Node(data);

                // Checks if the list is empty
                if (head == null) {
                        // If list is empty, both head and tail will point to new node
                        head = newNode;
                        tail = newNode;
                } else {
                        // Node temp will point to head
                        Node temp = head;
                        // newNode will become new head of the list
                        head = newNode;
                        // Node temp(previous head) will be added after new head
                        head.next = temp;
                }
        }

        public void deleteFromStart() {  
          
                //Checks if the list is empty  
                if(head == null) {  
                    System.out.println("List is empty");  
                    return;  
                }  
                else {  
                    //Checks whether the list contains only one node  
                    //If not, the head will point to next node in the list and tail will point to the new head.  
                    if(head != tail) {  
                        head = head.next;  
                    }  
                    //If the list contains only one node   
                    //then, it will remove it and both head and tail will point to null  
                    else {  
                        head = tail = null;  
                    }  
                }  
            } 
            
            public void addAtEnd(int data) {  
                //Create a new node  
                Node newNode = new Node(data);  
                  
                //Checks if the list is empty  
                if(head == null) {  
                    //If list is empty, both head and tail will point to new node  
                    head = newNode;  
                    tail = newNode;  
                }  
                else {  
                    //newNode will be added after tail such that tail's next will point to newNode  
                    tail.next = newNode;  
                    //newNode will become new tail of the list  
                    tail = newNode;  
                }  
            }  



            public void deleteFromEnd() {  
          
                //Checks if the list is empty  
                if(head == null) {  
                    System.out.println("List is empty");  
                    return;  
                }  
                else {  
                    //Checks whether the list contains only one element  
                    if(head != tail ) {  
                        Node current = head;  
                        //Loop through the list till the second last element such that current.next is pointing to tail  
                        while(current.next != tail) {  
                            current = current.next;  
                        }  
                        //Second last element will become new tail of the list  
                        tail = current;  
                        tail.next = null;  
                    }  
                    //If the list contains only one element   
                    //Then it will remove it and both head and tail will point to null  
                    else {  
                        head = tail = null;  
                    }  
                }  
            }  







        // display() will display all the nodes present in the list
        public void display() {
                // Node current will point to head
                Node current = head;
                if (head == null) {
                        System.out.println("List is empty");
                        return;
                }
                System.out.println("Adding nodes to the start of the list: ");
                while (current != null) {
                        // Prints each node by incrementing pointer
                        System.out.print(current.data + " ");
                        current = current.next;
                }
                System.out.println();
        }

        public static void main(String[] args) {

                single_Link_list sList = new single_Link_list();
                Scanner s = new Scanner(System.in);

                while (true) {
                        System.out.println("Enter your choice");
                        int choice = s.nextInt();
                        switch (choice) {
                                case 1:
                                        System.out.println("Enter element");
                                        int data = s.nextInt();
                                        sList.addAtStart(data);
                                        sList.display();
                                        break;
                                case 2:
                                sList.deleteFromStart();
                                sList.display();
                                break;

                                case 3:
                                System.out.println("Enter element");
                                int element = s.nextInt();
                                sList.addAtEnd(element);
                                sList.display();
                                break;

                                case 4:
                                sList.display();
                                break;
                                case 5:
                                sList.deleteFromEnd();
                                sList.display();
                                break;
                                case 6:
                                        return;
                                default:
                                        System.out.println("Invalid choice. Please try again.");
                        }
                }
        }
}