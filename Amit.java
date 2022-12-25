    import java.util.*; 
 class Animal {
    String name;
    String category;
    public Animal(String name,String category){
        this.name=name;
        this.category=category;
    }
    public void printdetails(){
        System.out.println("the name of animal:"+this.name +"\n their category:"+this.category);
    }
}
 class Bird{
    String name;
    String category;
    int numberofwing;
    public Bird(String name,String category,int numberofwing){
        this.name=name;
        this.category=category;
        this.numberofwing=numberofwing;

    }
    public void printdetails(){
        System.out.println("the name of bird:"+this.name +"\n the name of category:"+this.category +"\n number of wing:"+this.numberofwing);

    } 
}
public class Amit{
    public static void main(String[]args){
        Animal b1=new Animal("tiger","mamaal");
        Bird b2=new Bird("eagle","aves",2);
        b1.printdetails();
       b2.printdetails();
    }
}
    