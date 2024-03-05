public class Recursion {
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        printDec(n-1);
    }
    public static void printInc(int n){
        if(n==1){
            System.out.println(n+" ");
            return;
        }
        printInc(n-1);
        System.out.println(n+" ");
    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = factorial(n-1);
        int fact = n*fnm1;
        return fact;
    }
    public static int sumoffirstnnos(int n){
        if(n==1){
            return 1;
        }
        int s =sumoffirstnnos(n-1);
        int sum = n+s;
        return sum;
    }
    public static int nthfibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int fib1 = nthfibonacci(n-1)+nthfibonacci(n-2);
        return fib1;
    }
    public static boolean issorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return issorted(arr, i+1);
    }
    public static int firstoccurance(int arr[],int i ,int k){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==k){
            return i;
        }
        else{
            return firstoccurance(arr, i+1, k);
        }
    } 
    public static int lastOccurance(int arr[],int i,int k){
        if(i==arr.length){
            return -1;
        }
        int isFound=lastOccurance(arr, i+1, k);
        if(isFound==-1 && arr[i]==k){
            return i;
        }
        return isFound;
    }
    public static void main(String args[]){
       //printDec(10);
       //printInc(10);
       //System.out.println(factorial(5));
       //System.out.println(sumoffirstnnos(10));
       //System.out.println(nthfibonacci(24));
       //int arr[]={1,2,6,4,5};
       //System.out.println(issorted(arr, 0));
       //System.out.println(firstoccurance(arr, 0, 9));
       int arr[]={1,2,6,4,5,6,3,2};
       System.out.println(lastOccurance(arr, 0, 6));
    }
}
