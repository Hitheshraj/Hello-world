package Inheritance;

public class main {
    public void car(){//what all a normal car dan do
        System.out.println("\nThe basic features of car are :\n");
        System.out.println("it can drive(go back and fourth:)");
        System.out.println("can play music");
        System.out.println("can run on non renuvable resorce like petrolium or dissel");
        System.out.println("has lights ");
    }
}
class tesla extends main{
    public static void main(String[] args) {//a advanced car features
        main ob =new tesla();
        ob.car();
        System.out.println(("The advanced features of tesla cars "));
        System.out.println("can run on current");
        System.out.println("has aouto drive mode");
        System.out.println("has auto sensores");


    }
}
