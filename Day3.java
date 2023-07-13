import java.util.Scanner;

class Node{
  int data;
  Node next;
  Node prev;

  public Node(int data){
    this.data = data;
    this.next = null;
    this.prev = null;
  }
}

class Main {
  static Scanner sc = new Scanner(System.in);
  Node head;
  void CreateList(){
    Node current = head;
    System.out.println("Enter no of elements");
    int n = sc.nextInt();
    System.out.println("Enter elements:");
    head = new Node(sc.nextInt());
    current = head;
    for(int i=1;i<n;i++){
      Node newNode = new Node(sc.nextInt());
      current.next = newNode;
      newNode.prev = current;
      current = current.next;
    }
  }

  void Display(){
    Node current = head;
    while(current!=null){
      System.out.println(current.data);
      current = current.next;
    }
  }

  void Delete(){
    System.out.println("Enter element to be deleted");
    int v = sc.nextInt();
    Node current = head;
    Node temp = current;
    while(current!=null){
      if(v==current.data){
        temp.next = current.next;
        current.prev = temp;
        break;
      }
      else{
        temp = current;
        current = current.next;
      }
    }
  }
  public static void main(String[] args) {
    Main m = new Main();
    m.CreateList();
    m.Delete();
    System.out.println("Updated list: ");
    m.Display();
  }
}