package Stack;


import java.util.Scanner;

import static java.lang.System.*;

public class test {
    public static void main(String[] args) {
        try {
            int ch;
            stack op=new stack();
            do {
                Scanner inp = new Scanner(in);
                out.println("enter the opction bellow:\n1.push\n2.pop\n3.display");
                ch = inp.nextInt();
                switch (ch){
                    case 1:
                            out.println("Enter the element to push");
                            int ele = inp.nextInt();
                            op.push(ele);
                            break;
                    case 2:
                        op.pop();
                        break;
                    case 3:
                        op.display();
                        break;
                }
            } while (ch != 4);
        }
        catch (Exception ex){
            out.println(ex.getMessage());
        }
    }
}
