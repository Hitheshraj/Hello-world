package Threads.Syncronization;

public class Syncronizied_ex2 {
    synchronized static void printTable(int n){
        for(int i=1;i<100;i++){
            System.out.println(n*i);
        }
        try{
            Thread.sleep(500);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
class MyThread extends Thread{
    Syncronizied_ex2 t = new Syncronizied_ex2();
    public void run(){
        t.printTable(10000);
    }
}
class MyThread1 extends Thread{
    Syncronizied_ex2 t1 = new Syncronizied_ex2();
    public void run(){
        t1.printTable(100);
    }
}
 class Testsyn{
    public static void main(String[] args) {
        MyThread ob1 = new MyThread();
        MyThread ob2 = new MyThread();
        ob1.start();
        ob2.start();
    }
}