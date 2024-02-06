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
        public static void ithbit(int n,int i){
            int bit=1<<i;
            if((n&bit)==0){
                System.out.println(0);
            }
            else{
                System.out.println(1);
            }
        }
        public static int setithbit(int n,int i){
            int bit=1<<i;
            return n|bit;
        }
        public static int clearithbit(int n,int i){
            int bit=~(1<<i);
            return n&bit;
        }
        public static int updateithbit(int n,int i,int newbit){
            // if(newbit==0){
            //     return clearithbit(n,i);
            // }
            // else{
            //    return setithbit(n,i);
            // }
            n=clearithbit(n,i);
            System.out.println(n);
            int bit = newbit<<i;
            return n|bit;
        }
        public static int clearibits(int n,int i) {
            int bit=(~0)<<i;//~0=111111111111111
            return n&bit;
            
        }
        public static int clearrangebits(int n,int i,int j){
            int a=((~0)<<j+1);
            int b=((1<<i)-1);
            int bit= a|b;
            return n&bit;
        }
        public static boolean ispowofTwo(int n){
            return((n&(n-1))==0);
        }
        public static int setbitcount(int n){
            int count=0;
            while(n>0){
                if((n&1)!=0){
                    count++;
                }
                n=n>>1;
            }
            return count;
        }
        public static int fastexpo(int a,int n){
            int ans=1;
            while(n>0){
                if((n&1)!=0){
                    ans=ans*a;
                }
                a=a*a;
                n=n>>1;
            }
            return ans;
        }
        public static void main(String args[]){        
            Scanner sc =new Scanner(System.in);
            //System.out.println("Enter the number");
            //int n=sc.nextInt();
            //System.out.println("Enter the ith bit");
            //int i=sc.nextInt();
            //Evenorodd(n);
            //ithbit(n, i);
            //System.out.println(setithbit(n,2));
            //System.out.println(clearithbit(n, i));
            //System.out.println("Enter the new bit");
            //int newbit =sc.nextInt();
            //System.out.println(updateithbit(n,i,newbit));
            //System.out.println(clearibits(n, i));
            //int j=sc.nextInt();
            //System.out.println(clearrangebits(n,i,j));
            //System.out.println(ispowofTwo(n));
            //System.out.println(setbitcount(n));
            System.out.println("Enter the number");
            int a =sc.nextInt();
            System.out.println("Enter the power");
            int n =sc.nextInt();
            System.out.println(fastexpo(a, n));
        }
}