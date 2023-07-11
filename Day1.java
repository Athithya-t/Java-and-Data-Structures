import java.util.Scanner;
class Day1 {
  static Scanner sc = new Scanner(System.in);
  void PositiveNegativeZero(){
    int num = sc.nextInt();
    if(num>0) System.out.println("Positive");
    else if(num<0) System.out.println("Negative");
    else System.out.println("Zero");
  };
  void Greatestoftwo(){
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    if(num1>num2) System.out.println(num1+" is greater");
    else System.out.println(num2+" is greater");
  };
  void OddorEven(){
    int num = sc.nextInt();
    if(num%2==0) System.out.println(num+" is even"); 
    else System.out.println(num+" is odd");
  };
  void SumisOddorEven(){
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    if((num1+num2)%2!=0) System.out.println("Sum is odd");
    else System.out.println("Sum is even");
  };
  void onetohundred(){
    for (int i=0;i<=100;i++) System.out.println(i);
  };
  void onetohundredalt(){
    for (int i=1;i<=100;i+=2) System.out.println(i);
  };
  void hundredtoone(){
    for(int i=100;i>0;i--) System.out.println(i);
  };
  void hundredtoonealt2(){
    for (int i=100;i>0;i-=3) System.out.println(i);
  }
  public static void main(String[] args) {
    Main m = new Main();
    //Use ObjectName.FunctionName to call any function
    m.OddorEven();//Sample function call
  }
}