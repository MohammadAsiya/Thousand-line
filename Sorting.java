import java.util.Arrays;
import java.util.Collections;
public class Sorting {
    public static void bubblesort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void  optbubblesort(int arr[]){//for already sorted array complexity 0(n)
        for(int turn=0;turn<arr.length-1;turn++){
            int swap=0;
            System.out.println(turn+"th turn");
            for(int j=0;j<arr.length-1-turn;j++){
                System.out.print(turn+" "+j+"iteration"+"\t");
                if(arr[j]>arr[j+1]){
                    swap++;
                    /*int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;*/
                }
            }
            if(swap==0){
                break;
            }
            System.out.println();
            System.out.println("---------");
        }
    }
    public static void Selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void insertionsort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev =i-1;
            //finding out the correct pos to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }
    }
    public static void printing(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void printing(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String  args[]){
        int arr[]={3,5,1,4,2};
        //optbubblesort(arr);
        //printing(arr);
        int arr2[]={1,2,3,4,5};
        //optbubblesort(arr2);
        //printing(arr2);
        int arr3[]={3,5,1,4,2};
        //Selectionsort(arr3);
        //printing(arr3);
        int arr4[]={4,2,1,5,3};
        insertionsort(arr4);
        //printing(arr4);
        int arr5[]={3,2,1,5,4};
        //Arrays.sort(arr5);
        //Arrays.sort(arr5,0,2);
        //printing(arr5);
        Integer arr6[]={1,4,7,9,8,6,3,5,2};
        Arrays.sort(arr,0,6,Collections.reverseOrder());
        printing(arr6);

    }
}
