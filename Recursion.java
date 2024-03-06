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
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        //int xnm1 = power(x,n-1);
        //int xn =x*xnm1;
        //return xn;
        return x*power(x,n-1);
    }
    public static int optimizedPower(int a ,int n){
        if(n==0){
            return 1;
        }
        int halfpowr=optimizedPower(a, n/2);
        int halfpowrsq=halfpowr*halfpowr;
        //n is odd
        if(n%2 !=0){
            halfpowrsq = a* halfpowrsq;
        }
        return halfpowrsq;
    }
    public static int tilling(int n){//floor size 2xn
        if(n==0 || n==1){
            return 1;
        }
        //choice
        //vertically
        int fnm1=tilling(n-1);
        //horizontally
        int fnm2=tilling(n-2);
        int ways=fnm1+fnm2;
        return ways;
    }
    public static void removeDuplicates(String str,int idx,StringBuilder newstr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        //kaam
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            //If it is already present in previous chars of string
            //Donot add to newstr
            removeDuplicates(str, idx+1, newstr, map);
        }
        else{
            map[currChar-'a']=true;
            removeDuplicates(str, idx, newstr.append(currChar), map);
        }
        
    }
    public static int friendsPairing(int n){
        //Base case
        if(n==1||n==2){
            return n;
        }
        //choice
        //single
        int fnm1=friendsPairing(n-1);
        //Pairing
        int fnm2=friendsPairing(n-2);
        int pairways=(n-1)*fnm2;
        int totways =fnm1+pairways;
        return totways;
    }
    public static void printBinStrings(int n,int lastplace,String str){
        //Base
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinStrings(n-1,0, str+"0");
        if(lastplace==0){
            printBinStrings(n-1,1, str+"1");
        }

    }
    //Question 1 Find all occurances of the key
    public static void findOccurances(int arr[],int i,int key){
        //Base case
        if(i==arr.length){
            return;
        }
        if(arr[i]==key)
            System.out.println(i);
        findOccurances(arr, i+1, key);
    }
    //Q 2:print year in string
    static String digits[] ={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printYear(int n){
        //base case
        if(n==0){
            return;
        }
        int lastdigit =n%10;
        printYear(n/10);
        System.out.print(digits[lastdigit]+" ");
    }
    //Q3 Length of aString
    public static int lenString(String str){
        //base
        if(str.length()==0){
            return 0;
        }
        return lenString(str.substring(1))+1;
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
       //int arr[]={1,2,6,4,5,6,3,2};
       //System.out.println(lastOccurance(arr, 0, 6));
       //System.out.println(power(2,4));
       //System.out.println(optimizedPower(2,5));
       //System.out.println(tilling(3));
       //String s = "appnnacollege";
       //removeDuplicates(s, 0,new StringBuilder(""), new boolean[26]);
       //System.out.println(friendsPairing(5));
       //printBinStrings(3, 0, " ");
       //int arr[]={3,2,4,5,6,2,7,2,2};
       //findOccurances(arr, 0, 2);
       //printYear(1940);
       System.out.println(lenString("Hello"));


    }
}
