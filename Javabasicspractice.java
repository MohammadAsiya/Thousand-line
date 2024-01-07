import java.util.*;
public class Javabasicspractice{
    public static void main (String [] args){
    //sum of two elements
   /*Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int total = a + b;
    System.out.println(total);
   */

   //product of two elements
   /*Scanner sc =new Scanner(System.in);
   int a = sc.nextInt();
   int b = sc.nextInt();
   int product =a * b;
   System.out.println(product);*/

   //Area of circle
   /*Scanner sc= new Scanner(System.in);
   Float rad = sc.nextFloat();
   Float area =3.14f*rad*rad;
   System.out.println(area);
   */


   //Conditional statements
   //Task1 check wheater the  number is positive or not
  /*  Scanner sc = new Scanner(System.in);
   System.out.print("Enter a number:");
   int num=sc.nextInt();
   if (num>0)
        System.out.println("Positive number");
    else
        System.out.println("negative number");

    */



    //Task2 checking fever
    /*double temp =103.5;
    if(temp>100)
        System.out.println("You have fever");
    else
        System.out.println("You Do't have fever");*/


    //Task3 week days
   /*Scanner sc =new Scanner(System.in);
    System.out.println("Enter the number");
    int num =sc.nextInt();
    switch(num){
        case 1:System.out.println("Sunday");
               break;
        case 2:System.out.println("Monday");
               break;
        case 3:System.out.println("Tuesday");
               break;
        case 4:System.out.println("Wednesday");
               break;
        case 5:System.out.println("Thursday");
               break;
        case 6:System.out.println("Friday");
               break;
        case 7:System.out.println("Saturday");
               break;
        default:System.out.println("Enter the correct number");
    }
  */

    //Task 4 leap year or not
  /* Scanner sc = new Scanner(System.in);
    System.out.println("Enter the year");
    int year = sc.nextInt();
    if (year%4==0){
        if(year%100==0){
            if(year%400==0)
                System.out.println("Leap year");
            else
                System.out.println("Not Leap year");
        }
        else{
            System.out.println("Leap year");
        }
    }
    else{
        System.out.println("Not leap year");
    }*/

    //take inputs from the user and return sum of even numbers and odd numbers

   /* System.out.println("Enter the number of how many numbers you entered");
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    int evensum=0,oddsum=0;
    for(int i=0;i<n;i++){
        System.out.println("Enter the number");
        int c =sc.nextInt();
        if(c%2==0){
            evensum+=c;
        }
        else
            oddsum+=c;
    }
    System.out.println("Even numbers sum is:"+evensum);
    System.out.println("Odd numbers sum is:"+oddsum);
    */
    //Factorial of a number
    
   /* Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int n = sc.nextInt();
    int fact=1;
    for(int i=1;i<=n;i++){
        fact*=i;
    }
    System.out.println("Factorial is :"+fact);
    */

    //Multiplication of Table
  /* Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    System.out.println(n+" Table is");
    for(int i=1;i<=10;i++){
        System.out.println(i+"x"+n+"="+i*n);
    }*/
    
    //pattern programs
    }
}

