import java.util.Scanner;

class Main {
  int[] stack;
  int top = -1;
  int size;
  public Main(int size){
    this.stack = new int[size];
    this.size = size;
  }
  static Scanner sc = new Scanner(System.in);
  void Push(int num){
    if(size-1!=top){
      top++;
      stack[top] = num;
    }
    else{
      System.out.println("Overflow");
    }
  }
  void Display(){
    System.out.println("Stack elements");
    while(top!=-1){
      System.out.println(stack[top]);
      top--;
    }
  }

  void Pop(){
    if(top!=-1){
    System.out.println("Popped element is: "+stack[top]);
    top--;}
    else{
      System.out.println("Underflow");
    }
  }
  
  public static void main(String[] args) {
    System.out.println("Enter no of elements to be pushed");
    int n = sc.nextInt();
    Main m = new Main(n);
    for(int i=0;i<n;i++){
      m.Push(sc.nextInt());
    }
    sc.nextLine();
    while(true){
      System.out.println("Do you want to pop:(y/n)");
      char y_n = sc.nextLine().charAt(0);
      if(y_n=='y'){
        m.Pop();
      }
      else{
        break;
      }
    }
    m.Display();
  }
}