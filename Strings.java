import java.util.*;

import javax.xml.transform.stax.StAXResult;
import javax.xml.validation.SchemaFactoryConfigurationError;
public class Strings {
    /*public static void main(String args[]){
       /*char[]arr={'a','b','c','d'};
        String s ="abcd";
        String str2=new String("xyz");
        //Strings are IMMUTABLE

        //==>Input
        Scanner sc =new Scanner(System.in);
       // String name =sc.next();//ASIYA MOHAMMAD
       // System.out.println(name);//ASIYA
        String name2 =sc.nextLine();//Hi I am asiya
        System.out.println(name2);//Hi I am asiya
        String x="Hello guys!";
        System.out.println(x.length());*/
       /*
        String firstname ="Asiya";
        String Lastname = "Mohammad";
        String Fullname =firstname+" "+Lastname;
        System.out.println(Fullname);
        printletters(Fullname);
    }
    public static void printletters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }*/


//==>Palindrome or not
   /* public static Boolean checkpalindrome(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    } 
//==>Get shortest path
    public static float getshortestpath(String s){
        int x=0,y=0;
        for(int i=0;i<s.length();i++){
            char dir =s.charAt(i);
            //North
            if(dir=='N'){
                y++;
            }
            //east
            else if(dir=='E'){
                x++;
            }
            //south
            else if(dir=='S'){
                y--;
            }
            //west
            else{
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s =sc.next();
        System.out.println(getshortestpath(s));
        //System.out.println(checkpalindrome(s));
    }*/

//==>comparision operators
 /* public static void main(String args[]){
    String s1 ="Tony";
    String s2 ="Tony";
    String s3 = new String("Tony");

    if(s1==s2){
        System.out.println("both are equal");
    }
    else{
        System.out.println("both are not equal");
    }
    if(s1==s3){
        System.out.println("Both strings are eqal");
    }
    else{
        System.out.println("Both Strings are not equal");
    }
    if(s1.equals(s3)){
        System.out.println("Both Strings are Equal");
    }
  }
  */

//==>lexicolly largest string
  public static void main(String args[]){
    String fruits[]={"apple","banana","mango","berry","kiwi"};
    String largest=fruits[0];
    for(int i=1;i<fruits.length;i++){
        if(largest.compareTo(fruits[i])<0){
            largest=fruits[i];
        }
    }
    System.out.println(largest);
  }
}
