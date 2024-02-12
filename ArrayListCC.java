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
    public static void main(String[] args) {
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
    }   
}
