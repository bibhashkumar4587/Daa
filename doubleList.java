class Node {
  int data;
  Node prev;
  Node next;

  public Node(int data) {
      this.data = data;
      this.prev = null;
      this.next = null;
  }
}

class doubleList {
  Node head;

  public doubleList() {
      this.head = null;
  }

  // Insert at the start of the list
  public void insertAtStart(int data) {
      Node newNode = new Node(data);
      if (head == null) {
          head = newNode;
      } else {
          newNode.next = head;
          head.prev = newNode;
          head = newNode;
      }
  }

  // Insert at the end of the list
  public void insertAtEnd(int data) {
      Node newNode = new Node(data);
      if (head == null) {
          head = newNode;
      } else {
          Node temp = head;
          while (temp.next != null) {
              temp = temp.next;
          }
          temp.next = newNode;
          newNode.prev = temp;
      }
  }

  // Delete from the start of the list
  public void deleteFromStart() {
      if (head == null) {
          System.out.println("List is empty");
          return;
      }
      if (head.next == null) {
          head = null;
      } else {
          head = head.next;
          head.prev = null;
      }
  }

  // Delete from the end of the list
  public void deleteFromEnd() {
      if (head == null) {
          System.out.println("List is empty");
          return;
      }
      if (head.next == null) {
          head = null;
      } else {
          Node temp = head;
          while (temp.next != null) {
              temp = temp.next;
          }
          temp.prev.next = null;
      }
  }

  // Display the list
  public void display() {
      if (head == null) {
          System.out.println("List is empty");
          return;
      }
      Node temp = head;
      while (temp != null) {
          System.out.print(temp.data + " ");
          temp = temp.next;
      }
      System.out.println();
  }

  public static void main(String[] args) {
    doubleList dll = new doubleList();
      
      // Insert at the start
      dll.insertAtStart(10);
      dll.insertAtStart(20);
      dll.insertAtStart(30);
      System.out.print("After inserting at start: ");
      dll.display();

      // Insert at the end
      dll.insertAtEnd(40);
      dll.insertAtEnd(50);
      System.out.print("After inserting at end: ");
      dll.display();

      // Delete from start
      dll.deleteFromStart();
      System.out.print("After deleting from start: ");
      dll.display();

      // Delete from end
      dll.deleteFromEnd();
      System.out.print("After deleting from end: ");
      dll.display();
  }
}
