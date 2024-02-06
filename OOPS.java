import javafx.scene.layout.StackPane;

public class OOPS {
    public static void main(String args[]){
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
