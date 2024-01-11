import java.util.*;
public class pattern {
    public static void main(String[] args) {
     /*   Scanner sc =new Scanner(System.in);
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
        } */

        //Butterfly pattern
        Scanner sc=new Scanner(System.in);
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
        }
    }
}

