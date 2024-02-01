import java.util.Scanner;

public class Bitmanupulation{
    /*public static void main(String args[]){
        //Binary AND
        System.out.println(5&6);
        //Binary or
        System.out.println(5|6); 
        //Binary not
        //Here MSB(Most Significant bit will be considered to check wheater the number is positive or not)
        System.out.println(~5);
        //Binary Left shift <<
//==>        //Formula a<<b=a*(2**b)
        System.out.println(5<<2);
        //Binary Right shift>>
            //Formula a>>b=a/(2**b)
        System.out.println(6>>1);
    }*/
//==>Checking if number is even or Odd.Here even numbers LSB is 0 and odd's 1.
        public static void Evenorodd(int n){
            int bit =1;
            if((n & bit)==0){
                //Even number
                System.out.println(n+" is Even number");
            }
            else{
                //odd number
                System.out.println(n+" is odd number");
            }
        }
        public static void main(String args[]){        
            Scanner sc =new Scanner(System.in);
            int n=sc.nextInt();
            Evenorodd(n);
        }
}