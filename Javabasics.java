import java.util.*;
import java.math.*;
public class Javabasics{
   // public static void main(String []args){
        //System.out.print("Hello Asiya!!");
        /*System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");*/

        //variables
     
        /*int b=20;
        System.out.println(a);
        System.out.println(b);

        a=50;
        System.out.println(a);

        a=b;
        System.out.println(a);*/


        //Datatypes[Primitive]
       /* byte b=8;
        char ch='a';
        short s=24;
        int i =14;
        float f = 3.1f;
        //long
        //double
        boolean boo =true;
        System.out.println(b);
        System.out.println(ch);
        System.out.println(s);
        System.out.println(i);
        System.out.println(boo);
        System.out.println(f);*/

        //Input
       /* Scanner sc = new Scanner(System.in);
        String s =sc.next();
        System.out.println(s);
        String Fullname = sc.nextLine();
        System.out.println(Fullname);
        int age = sc.nextInt();
        System.out.println(age);
        float rupees = sc.nextFloat();
        System.out.println(rupees);
        boolean disabled = sc.nextBoolean();
        System.out.println(disabled);
        short rank = sc.nextShort();
        System.out.println(rank);
        byte b =sc.nextByte();
        System.out.println(b);
        long l=sc.nextLong();
        System.out.println(l);
        double d =sc.nextDouble();
        System.out.println(d);*/
        
         
        //Type conversion, Widening [small datatype to long datatype]
        //byte->short->int->float->long->double
        /*Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        float b = a;
        System.out.println(b);*/

        //Type casting [long datatype to short datatype]
      /*  Scanner sc = new Scanner(System.in);
        float a=sc.nextFloat();
        int b = (int)a;
        System.out.println(b);
        char c ='C';
        int  d =(int)c;
        System.out.println(d); */

        //Type Promotion in Java
        //->Java automatically promotes byte,short,char operand to int when evaluting expression
        //->If operand has long,double,float the whole expression is promoted to long,double or float
        
        
        
        //Operators
        //Arthimatic =>Binary =>Unary
       /* int a=5;
        int b =2;
        System.out.println("Add ="+(a+b));
        System.out.println("Subtract ="+(a-b));
        System.out.println("Multiplication ="+(a*b));
        System.out.println("division ="+(a/b));
        System.out.println("Modulo ="+(a%b));
      */


      //unary
      //pre increment
     /*int a =10;
      int b = ++a;
      System.out.println(b);
      System.out.println(a);*/

      //post increment
      /*int a =10;
      int b = a++;
      System.out.println(b);
      System.out.println(a); */
    
      //pre decrement
     /*int a =10;
      int b = --a;
      System.out.println(b);
      System.out.println(a);*/

      //post decrement
      /*int a =10;
      int b = a--;
      System.out.println(b);
      System.out.println(a);*/


    //Relational operator
    //==,!=,>,<,>=,<=
   /* int A=5;
    int B =10;
    System.out.println(A==B);
    System.out.println(A!=B);
    System.out.println(A>B);
    System.out.println(A<B);
    System.out.println(A<=B);
    System.out.println(A>=B); */

    //Logical operators
    //And
  
   /* System.out.println((3>2)&&(2<4));

    //OR operator
    System.out.println((3>2)||(2<4));
    //Not
    System.out.println(!(2<4));
  
*/
 //Functions
 /*public static void printhelloworld(){
  System.out.println("Hello World!");
 }
 public static void main(String[] args) {
 printhelloworld();
 printhelloworld();
    }*/


  //parameters two types
  //=>Actual parameters
  //=>Formal parameters
 /* public static int sum(int n1,int n2)//Formal parameters{
    int sumis = n1+n2;
    return sumis;
  }
  public static void main(String args[]){
    int a =5;
    int b =10;
    int tot=sum(a,b);//Actual parameters
    System.out.println("Sum is"+tot);
  }
  */


  //Binomial coefficient
  //n!/r!*(n-r)!
 /* public static int factorial(int n){
    int f=1;
    for(int i=1;i<=n;i++){
      f=f*i;
    }
    return f;
  }
  public static void main(String args[]){
    //n=5,r=2
    int n=5,r=2;
    int a=factorial(n);
    int b=factorial(r);
    int c=factorial(n-r);
    int tot=a/(b*c);
    System.out.print(tot);
  }*/ 

  //Function overloading using parameters
 /*public static int sum(int a,int b){
    return a+b;
  }
  public static int sum(int a,int b,int c){
    return a+b+c;
  }
  public static void main(String args[]){
    int a=5;
    int b=10;
    int c=15;
    System.out.println("sum of two numbers is:"+sum(a,b));
    System.out.println("Sum of Three numbers is: "+sum(a,b,c));
  }
  */

  //Function overloading with datatypes
  /*public static int sum(int a,int b){
    return a+b;
  }
  public static float sum(float a ,float b){
    return a+b;
  }
  public static void main(String args[]){
    System.out.println("Integers sum is :"+sum(5,10));
    System.out.println("Float sum is: "+sum(3.5f,6.5f));
  }
  */

}