import java.util.*;
public class Searching {
    /*public static int linearsearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,34,56,23,76,79,90,98,116};
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the key value");
        int key =sc.nextInt();
        int index = linearsearch(numbers,key);
        if(index == -1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("The key found at index :"+index);
        }
    }*/


    //Binary Search
    /*public static int binarysearch(int numbers[],int key){
        int start =0;
        int end =numbers.length;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]>key){//left
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={2,4,13,15,57,79};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key value");
        int key =sc.nextInt();
        System.out.println("The key is at the index :"+binarysearch(numbers, key));
    }*/

    //REVERSE ARRAY
    public static void revarray(int numbers[]){
        int start=0;
        int end=numbers.length-1;
        while(start<end){
            int temp=numbers[start];
            numbers[start]=numbers[end];
            numbers[end]=temp;
            start++;
            end--;
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numbers[]= new int[10];
        System.out.println("Enter the array values");
        for(int i=0;i<10;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println("The reverse of array is:");
        revarray(numbers);
        for(int i=0;i<10;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}
