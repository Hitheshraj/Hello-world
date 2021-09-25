package Threads.interThread_com;
import java.util.Scanner;
import static java.lang.System.*;
class Total extends Thread{
    int total;
    int n;
    public void run(){
        out.println("value of n is : " + n);
        //synchronized (this) {
            for (int i = 0; i <=n; i++) {
                total = total + i;
            }
            out.println("Total value is : " + total);
      //  }
        notify();
    }
}
public class First_example {
    public static void main(String[] args) {
        Total obj = new Total();
        Scanner inp = new Scanner(in);
        out.println("Enter the value to sum:");
        int num = inp.nextInt();
        obj.n = num;
        obj.start();
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            out.println("The sum of number is :" + obj.total);
            System.err.println("Example for Stream");
        }
    }
}
