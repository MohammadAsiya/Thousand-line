import java.util.ArrayList;
import java.util.Collections;
//It is a java collection framework
public class ArrayListCC{
   /* public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Boolean> present = new ArrayList<>();*/
//==>Operations
//Add O(1) //at index O(n)
//Get element O(1)
//Remove element O(n)
//set an element O
        //Add an element O(1)
        /*list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1,9);//O(n)

        System.out.println(list);

        //Get element
        int element =list.get(3);
        System.out.println(element);

        //Remove element
        list.remove(2);
        System.out.println(list);
        //set element
        list.set(2,10);
        System.out.println(list);
        //contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

//size method
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

    }*/

//print reverse of an array
    /*public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }

    }*/

//Find max array
    /*public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int Maxvalue =Integer.MIN_VALUE;
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        for(int i=0;i<list.size();i++){
            Maxvalue =Math.max(Maxvalue, list.get(i));
        }
        System.out.println(Maxvalue);
    }*/

//swapping two numbers
    /*public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        swap(list,3,1);
        System.out.println(list);
    }*/


//Sorting
    /*public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println(list);
        //import Collections package
        //assending order
        Collections.sort(list);
        System.out.println(list);
        //desending order
        Collections.sort(list,Collections.reverseOrder());//comparator fnx logic
        System.out.println(list);
    }   */


//Multi dimensional array
    /*public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        list.add(l1);
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(3);
        l2.add(4);
        list.add(l2);
        System.out.println(list);
    }*/


//Container with most water
    //bruteforce O(n^2)
   /* public static int storewater(ArrayList<Integer> height){
        int maxwater =0;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int ht=Math.min(height.get(i),height.get(j));
                int width = j-i;
                int water = ht*width;
                maxwater=Math.max(maxwater,water);
            }
        }
        return maxwater;

    }*/

    //2pointer approach
    //Optimal O(n)
    /*public static int storewater(ArrayList< Integer> height){
        int maxwater=0;
        int lp=0,rp=height.size()-1;
        while(lp<rp){
            //calculating water
            int ht=Math.min(height.get(lp),height.get(rp));
            int width = rp-lp;
            int currwater = ht*width;
            maxwater =Math.max(maxwater,currwater);
            //updating pointer
            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }

        }
        return maxwater;

    }*/

    /*public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storewater(height));

    }*/


//pair sum
    //brute force approach
   /* public static boolean pairsum(ArrayList<Integer> list ,int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if((list.get(i)+list.get(j))==target){
                    return true;
                }
            }
        }
        return false;
    }*/

    //optimal
    //2 pointer
    /*public static boolean pairsum(ArrayList<Integer> list ,int target){
        int lp=0,rp=list.size()-1;
        while (lp!=rp){
           if((list.get(lp)+list.get(rp))==target){
                return true;
           } 
           else if(list.get(lp)+list.get(rp)<target){
                lp++;
           }    
           else{
                rp--;
           }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); 
        int target =5;
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(pairsum(list,target));
    }*/

//pairsum-2
   /*  public static boolean pairsum(ArrayList<Integer> list,int target){
        int bp=-1;
        int n =list.size();
        for(int i=0;i<n;i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        int lp=bp+1;
        int rp=bp;
        while(lp!=rp){
            if((list.get(lp)+list.get(rp))==target){
                return true;
            }
            else if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%n;
            }
            else{
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        int target =16;
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(pairsum(list,target));
    }*/

//ARRAYLIST QUESTIONSQuestion 1 :Monotonic ArrayList(EASY)An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.AnArraylistnumsismonotoneincreasingifforalli<=j,nums.get(i)<=nums.get(j).AnArraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise.
 /*  public static boolean monotonic(ArrayList<Integer> list){
    boolean inc=true;
    boolean dec=true;
    for(int i=0;i<list.size()-1;i++){
        if(list.get(i)>list.get(i+1)){
            inc=false;
        }
        if(list.get(i)<list.get(i+1)){
            dec=false;
        }
    }
    return inc||dec;
  }
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(6);
    list.add(4);
    System.out.println(monotonic(list));
  }
}*/
