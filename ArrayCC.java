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
    /*public static void update(int marks[]){
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


    }*/


    //Largest and smallest of array
   /*  public static int  getlargest(int numbers[]){
       int largest =Integer.MIN_VALUE;//-infinity
       int smallest =Integer.MAX_VALUE;//+infinity
       for(int i=0;i<numbers.length;i++){
        if(largest<numbers[i]){
            largest=numbers[i];
        }
        if(smallest>numbers[i]){
            smallest=numbers[i];
        }
       }
       System.out.println("smallest value is: "+smallest);
       return largest;
       
    }
    public static void main(String args[]){
        int numbers[]={1,2,6,4,9};
        System.out.println("Largest value is :"+getlargest(numbers));
    }*/
//===>Maximum subarray
    //Maximum subarray Brute force method
    /*public static void maxsubarray(int arr[]){
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<arr.length;i++){
            int start =i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                currsum=0;
                System.out.print("[");
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                    currsum+=arr[k];
                }
                System.out.print("]");
                System.out.print("Current sum"+currsum);
            System.out.print("\t");
            if(maxsum<currsum){
                maxsum=currsum;
            }
            }
            System.out.println();

        }
        System.out.println("Maximum subarray sum is:"+maxsum);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size :");
        int n =sc.nextInt();
        System.out.println("Enter array elements:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Given array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        maxsubarray(arr);
    }*/


    //Better approach Prefix method
   /* public static void maxsubarray(int arr[]){
        int currsum=0;
        int maxsum =Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        //Calculate prefix array
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                //for(int k=start;k<=end;k++) brute force approach
                //currsum+=arr[k]==>brute
                
                currsum= start == 0 ?prefix[end]:prefix[end]-prefix[i-1];
                System.out.print(currsum+" ");
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("Maximum subarray sum is:"+maxsum);
    }
    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        maxsubarray(arr);
    }*/

    //Kadens algo for array contains positive numbers
    /*public static void kadans(int arr[]){
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<arr.length;i++){
              currsum+=arr[i];
              if(currsum<0){
                currsum=0;
              }
            if(maxsum<currsum){
                maxsum=currsum;
            }
        }
        System.out.print("Maximum sum :"+maxsum);
    }
    public static void main (String args[]){
        int arr[]={-2,-3,-4,-1,-2,-1,-5,-3};
        kadans(arr);
    }
}*/
//===>>Trapping rain waterr  
    public static int trappingwater(int height[]){
        int n=height.length;
        int width=1;
        //left-max-array
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }

        //rigt-max array
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }

        int trappingwater=0;
        //loop
        for(int i=0;i<n;i++){
        //find  water level
        //minimum of leftmax and right max
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            //trapping water
            trappingwater+=(waterlevel-height[i])*width;
            
        }
        return trappingwater;

    }
    public static void main(String args[]){
        int height[] ={4,2,0,6,3,2,5};
        System.out.println(trappingwater(height));
    }
}