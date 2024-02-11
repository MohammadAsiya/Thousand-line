
import javax.swing.plaf.synth.SynthScrollPaneUI;
import javax.xml.transform.stax.StAXResult;
import javax.xml.transform.stax.StAXSource;

import javafx.scene.layout.StackPane;

public class OOPS {
    /*public static void main(String args[]){
        Pen p1= new Pen();//created pen object
        System.out.println(p1.color);
        System.out.println(p1.Tip);
        p1.setColor("pink");
        p1.settip(15);
        System.out.println(p1.color);
        System.out.println(p1.Tip);
        Bankacc myBankacc = new Bankacc();
        myBankacc.username="Asiya";
        myBankacc.password="secret";//Gives error because password is private variable it cannot accesable in another class.
    }
    
}
//Actually class name start with "CAPITAL letter " & Method name start with "small letter"
class Pen{
    String color="blue";
    int Tip=1;
    void setColor(String newcolor){
        color=newcolor;
    }
    void settip(int newtip){
        Tip = newtip;
    }
}
class Bankacc{
    public String username;
    private String password;
}
*/
//==>Getters,setters and "this" keyword
//This keyword is used to access that class variable.
  /*public static void main (String args[]){
    Pen p1= new Pen();//created pen object
    System.out.println(p1.getColor());
    System.out.println(p1.getTip());
    p1.setColor("pink");
    p1.settip(15);
    System.out.println(p1.getColor());
    System.out.println(p1.getTip());
  }
}
class Pen{
    private String color="blue";
    private int Tip=1;
    String getColor( ){
        return this.color;
    }
    int getTip(){
        return this.Tip;
    }
    void setColor(String newcolor){
        this.color=newcolor;
    }
    void settip(int newtip){
        this.Tip = newtip;
    }*/


//==>Encapsulation
//Encapsulation is defined as the wrapping up of the data & Methods under a single unit.
//example:capsul(omage)
//It also implements data hiding.(public,private,default,protected)

//Constructors
//Constructor is a speacial method which is invoked automatically at the time of "object creation".
//~~Constructors have the  same name as class name or structure
//~~Constructors don't have a return time.(Not even void)
//~~Constructors are only called once,at object creation.
//~~Memory allocation happens when constructor is called.
   /* 
    public static void main(String[] args) {
        Student s1 = new Student("Asiya");
        System.out.println(s1.name);
    }
}
class Student{
    String name;
    int roll;
    Student(String name){
        this.name =name;
    }
    */



//Types of constructors
//==>Non parameterized
//==>Parameterized
//==>copy constructor


//Constructor overloading(polymorphism)
    /*public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("Asiya");
        System.out.println(s2.name);
        Student s3 = new Student(79);
        System.out.println(s3.roll);
        //Student s4 = new Student("zoya",38);//gives Erorr because there is no constructor with 2 parameters.
    }



}
class Student {
    String name;
    int roll;
//==>Non parameterized
    Student(){
        System.out.println("Constructor is called...");
    }
//==>Parameterized
    Student(String name){
        this.name=name;
    }
    Student(int roll){
        this.roll =roll;
    }*/


//==>Copy constructor
//It's work is to copy one object properties to another object.
    /*public static void main(String args[]){
        Student s1 = new Student();
        s1.name="Asiya";
        s1.roll = 79;
        s1.password ="abcd";


        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        Student s2 = new Student(s1);//copying of s1 values into s2.
        s2.password ="xyz";
        s1.marks[2]=100;//Here we are changing s1 marks In above code s2 is already copied s1 marks
        //but now it is changed .Because s2 didn't store the array(it stores array reference) it is pointing to s1 's array. 

        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
        
  }
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];
///==> Shallow  Copy constructor
    //Student(Student s1){
    //    marks = new int[3];
    //    this.name=s1.name;
    //    this.roll =s1.roll;
    //    this.marks=s1.marks;
    //}

    //Deep copy

    /*Student(Student s1){
       marks = new int[3];
       this.name=s1.name;
       this.roll =s1.roll;
       for(int i=0;i<marks.length;i++){
        this.marks[i]=s1.marks[i];
       }
    }*/
    /*Student(){
        marks = new int[3];
        System.out.println("Constructor is called...");
    }
    Student(String name){
        marks = new int[3];
        this.name = name;
    }
    Student(int roll){
        marks = new int[3];
        this.roll =roll;
    } */


//==>Shallow copy and deep copy differences
//In shallow copy changes will be reflected[ex.array]
//In Deep copy changes will not be reflected.

//Lazy copy


//==>Destructor .In java Garbage collector auatomatically destruct unneccesary elements.


//####==>Inheritance
//Inheritance is when properties and methods of base class are passed onto the derived class.(like parents DNA comes to us)
//Base class or parent class gives it's properties to the derived class or child class.


//==>Inheritance

/* 
//Single inheritanc
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();
        shark.breathe();
        shark.swim();
    }
}
//Base class
class Animal{
    String color;
    void eat(){
        System.out.println("Eating..");
    }
    void breathe() {
        System.out.println("breeathing..");
    }
}

//Derived class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swims in water..~~~");
    }
}
*/

//Multi level inheritance.
/*
  public static void main(String args[]){
    //Multilevel inheritance
    dog puppy =new dog();
    puppy.legs=4;
    System.out.println(puppy.legs);
    puppy.bread ="white hair";
    System.out.println(puppy.bread);
    puppy.breathe();

  }
}
class Animal{
    String color;
    void eat(){
        System.out.println("eating");
    }
    void breathe(){
        System.out.println("breethe");
    }
}
class Mammal extends Animal{
    int legs;
}
class dog extends Mammal{
    String bread;
}*/



//==>Heirarical inheritance
/*
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();
        shark.breeth();
        shark.swim();
        Mammal mam = new Mammal();
        mam.eat();
        mam.breeth();
        mam.walk();
        bird dove = new bird();
        dove.eat();
        dove.breeth();
        dove.fly();
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("eating");
    }
    void breeth(){
        System.out.println("breethe");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("Walking");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swimming in water~~");
    }
}
class bird extends Animal{
    void fly(){
        System.out.println("Flying");
    }
}*/

//Hybrid inheritance
//Homework problem
    public static void main(String[] args) {
        human h = new human();
        h.spl();
        h.walk();
        h.breethe();
  }
}
class Animal{
    String color;
    void eat(){
        System.out.println("eating food");
    }
    void breethe(){
        System.out.println("breething");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swimming in water");
    }
}
class Tuna extends Fish{
    void speacial(){
        System.out.println("looks beautiful");
    }
}
class shark extends Fish{
    void spl(){
        System.out.println("Can eat humans");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("Flying in sky");
    }
}
class peakok extends Bird{
    void spl(){
        System.out.println("can dance well");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("walking on earth");
    }
}
class dog extends Mammal{
    void love(){
        System.out.println("Love Bones");
    }
}
class cat extends Mammal{
    void love(){
        System.out.println("Love milk");
    }
}
class human extends Mammal{
    void spl(){
        System.out.println("Intelligent");
    }
}



//TYPES OF INHERITANCE-4
//1)Single level inheritance      base class----->>>derived class
//2)Multi level inheritance       base class----->>>>derived class------>>>>derived class
//3)Heirarical inheritance     one base class =====>>>Multiple derived classes.
//4)Hybrid inheritance
//5)Multiple inheritance is not available in java.