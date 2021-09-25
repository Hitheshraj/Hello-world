package polymorphism;
//this is Stacic polymorphysim(compile time):Difeerent methods with same has different parameters
//overloding

import java.util.Scanner;
import static java.lang.System.*;
public class polymorphysimstatic {
     int area(int a) {
        return a * a;
    }

     int area(int a, int b) {
        return a * b;
    }

}
class pstatic {
    public static void main(String[] args) {
        Scanner inp=new Scanner(in);
        polymorphysimstatic ob=new polymorphysimstatic();
        out.println("enter the side of the square:");
        int side=inp.nextInt();
        out.println("Area of square is :"+ ob.area(side));
        out.println("Enter the side of rectangl:");
        int sidea=inp.nextInt();int sideb=inp.nextInt();
        out.println("Area of rectangle is :"+ob.area(sidea,sideb));

    }
}

