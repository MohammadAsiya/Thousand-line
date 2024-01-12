import java.util.*;
public class pattern {
    public static void main(String[] args) {
        //Hollow rectangle
      /* Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int n =sc.nextInt();
        for(int i=1;i<n;i++){
            if(i==1 || i==n-1){
                for(int j=1;j<=n;j++){
                    System.out.print("* ");
                }
            }
            else{
                System.out.print("*");
                //j<=n-2;
                for(int j=1;j<=(2*n-3);j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        } 
        */

        //Butterfly pattern
       /* Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=(2*n)-(2*i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*i;k++){
                System.out.print(" ");
            }
            for(int j=i;j<n;j++){
                System.out.print("*");
            }
            System.out.println();

        */   
        
        
        //Inverted rotated half pyramid
        /* *
          **
         ***
        ****
       ***** */
       /* Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */


        //Inverted half pyramid numbers pattern
       /* Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            int count=1;
            for(int j=1;j<=n-i+1;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
        */


        //Floyd's Triangle
        /*Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }*/


        //0-1 Triangle
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }*/


        //Solid rhombous pattern
       /* Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/


        //Hollow Rohmbus
       /* Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        */


        //Diamond pattern
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        }
}

