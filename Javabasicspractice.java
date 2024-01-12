import java.util.*;
public class Javabasicspractice{
   // public static void main (String [] args){
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

     //Binary to decimal conversion
 /*public static int Bintodec(int bin){
    int mynum=bin;
    int pow=0;
    int dec=0;
    while(mynum>0){
       int last =mynum%10;
       if(last!=0 && last!=1){
          System.out.println("Enter the binary number");
          return 0;
       }
       dec = dec+(last*(int)Math.pow(2,pow));
       pow++;
       mynum=mynum/10;
    }
    return dec;
  }
  //public static void main(String args[]){
  public static void main(String args[]){ 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the binary number");
    int a = sc.nextInt();
    System.out.println("The binary number"+a+" in the form of decimal number is"+Bintodec(a));
    }*/



    //Decimal to Binary conversion
   /*public static int decbin (int n){
        int bin=0;
        int pow=0;
        while(n>0){
            int rem=n%2;
            bin=bin+rem*((int)Math.pow(10,pow));
            n=n/2;
            pow++;
        }
        return bin;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal number");
        int a =sc.nextInt();
        System.out.println("The binary Number for "+a+" is: "+decbin(a));

    }
*/


   // Average of Three numbers method
   /*public static float avgofthree(int a,int b,int c){
        float avg=(a+b+c)/3;
        return avg;
   }
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Three numbers");
    int n1 = sc.nextInt();
    int n2 =sc.nextInt();
    int n3 =sc.nextInt();
    System.out.println("The average of given Three numbers is :"+avgofthree(n1,n2,n3));
   }
   */

   //:Write a method named isEven that accepts an int argument.Themethodshouldreturntrueiftheargumentiseven,orfalseotherwise.Alsowriteaprogramtotestyourmethod
   /*public static boolean isEven(int n){
    if(n%2==0){
        return true;
    }
    return false;
   }
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int a =sc.nextInt();
    System.out.println("The Statement "+a+" is a Even number is "+isEven(a));
    
   }
   */


   //Palindrome
   //WriteaJavaprogramtocheckifanumberisapalindromeinJava?(121isapalindrome, 321 is not)Anumberiscalledapalindromeifthenumberisequaltothereverseofanumbere.g.,121isapalindromebecausethereverseof121is121itself.Ontheotherhand,321isnotapalindrome because the reverse of 321 is 123, which is not equal to 321
   public static boolean palindrome(int n){
    int m =n;
    int rev=0;
    while(n>0){
        int rem=n%10;
        rev=rev*10+rem;
        n=n/10;
    }
    if(rev==m){
        return true;
    }
    return false;

   }
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    System.out.println("The Statement "+n+" is Palindrome is: "+palindrome(n));
   }

}

