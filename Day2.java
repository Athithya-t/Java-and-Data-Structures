import java.util.Scanner;

class Node {
  int value;
  Node next;

  public Node(int value) {
    this.value = value;
    this.next = null;
  }
}

class Main {
  static Scanner sc = new Scanner(System.in);
  Node head;

  void CreateList() {
    System.out.println("Enter the number of elements:");
    int n = sc.nextInt();

    if (n <= 0) {
      System.out.println("Invalid number of elements!");
      return;
    }

    System.out.println("Enter the elements:");
    head = new Node(sc.nextInt());
    Node current = head;

    for (int i = 1; i < n; i++) {
      current.next = new Node(sc.nextInt());
      current = current.next;
    }
  }

  void DisplayList() {
    Node current = head;
    while (current != null) {
      System.out.println(current.value);
      current = current.next;
    }
  }

  void DeleteElement() {
    System.out.println("Enter element to be deleted");
    int ele = sc.nextInt();
    Node current = head;
    Node temp = null;
    while (current != null) {
      if (ele != current.value) {
        temp = current;
        current = current.next;
      } else {
        temp.next = current.next;
        break;
      }
      ;
    }
  }

  public static void main(String[] args) {
    Main m = new Main();
    m.CreateList();
    m.DeleteElement();
    m.DisplayList();
  }
}