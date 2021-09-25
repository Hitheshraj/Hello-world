package polymorphism;


//polymorphism is a process in which a call to an overridden method is resolved at runtime rather than compile time
//upcasting : if referance
//This is dynamic polymorphism (run time polymorphism): where one class accuring property of another class whic is sub class of other class
class shape{
     void draw(){
        System.out.println("draawing");
    }
}
class rectangle extends shape{
    void draw(){
        shape ob =new rectangle();
        ob.draw();
        System.out.println("drawing refctangle");
    }
}
class circle extends shape{
    void draw(){
        System.out.println("drawing circle");
    }
}
class triangle extends shape{
    void draw(){
        System.out.println("drawing triangle");
    }
}
public class main {
    public static void main(String[] args) {
        shape ob=new rectangle();
        ob.draw();
        shape el=new circle();
        el.draw();
        shape tri=new triangle();
        tri.draw();

    }
}
