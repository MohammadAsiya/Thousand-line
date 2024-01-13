import java.util.*;
public class ArrayCC{
   // public static void main(String args[]){
      //  Scanner sc=new Scanner(System.in);
        //Array creation,insertion,updation,print
       /*  int marks[]= new int[40];
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("phy :"+marks[0]);
        System.out.println("chem :"+marks[1]);
        System.out.println("Maths :"+marks[2]);

        System.out.println("Average is :"+(marks[0]+marks[1]+marks[2])/3);

        //length of array
        System.out.println("Array length is :"+marks.length);


        

    }*/




    //PASS BY REFERENCE
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]+=1;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int marks[]={96,97,97};
        update(marks);
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();


    }
}