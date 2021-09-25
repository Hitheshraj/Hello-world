package Threads;

import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
import static java.lang.System.*;
    /*Thread is a small unit of process,it performs multiple tasks,which does not intrupts the main program
    Two types of creaction of thread are
    >extending thread class::say it is similar to inheritance,we can extend only one class
    >implementing thread class:: say it is similar to interface,we can implement one or more class
    -----------------------------------------------------------------------------------------------------------------------------
    Below is example for extends

    * */
    class thread_ex1 extends Thread{
        public void run(){
            Scanner inp=new Scanner(in);
            out.println("Enter the number to add a+b");
            int a=inp.nextInt();
            int b=inp.nextInt();
            int result = a+b;
            out.println(result);
        }

        public static void main(String[] args) {
            Scanner inp=new Scanner(in);
            thread_ex1 ob=new thread_ex1();
            System.out.println("Enter the number to square:");
            int n=inp.nextInt();
            ob.start();
            int square = n*n;
            out.println(square);
        }
    }

