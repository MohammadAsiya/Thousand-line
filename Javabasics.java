import java.util.*;
public class Javabasics{
    public static void main(String []args){
        //System.out.print("Hello Asiya!!");
        /*System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");*/

        

        //variables
       /*  int a=10;
        int b=20;
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
        Scanner sc = new Scanner(System.in);
        float a=sc.nextFloat();
        int b = (int)a;
        System.out.println(b);
        char c ='C';
        int  d =(int)c;
        System.out.println(d);

        //Type Promotion in Java
        //->Java automatically promotes byte,short,char operand to int when evaluting expression
        //->If operand has long,double,float the whole expression is promoted to long,double or float
        

    }
}