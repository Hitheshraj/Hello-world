package Threads.Syncronization;
//We can understand the perfomence of thread in main method
public class Syncronization_example {
    int count;
    public synchronized void  increment(){
        count++;
    }
}
 class syncDemo{
    public static void main(String[] args) throws InterruptedException {//we must throw exception when we use join
        Syncronization_example c = new Syncronization_example();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000000;i++){
                    c.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000000;i++){
                    c.increment();
                }
            }
        });
        t1.start();
        t2.start();
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        t1.join();
        t2.join();//join tells The Thread to wait till the program is finished or complete its job
        System.out.println("count ="+c.count);
    }
}
/*
-------------------------------------------------------------------------------------------------------------------
If we use two loop as shown above it does not show the requried result because
They will be running in paralell so in between when t1 ask for value count gives ex 600 t2 also ask for the value
as both are fetching value and asking for increment
As both are calling parlally this problem accour
>>> what we do is we use syncronized in the increment method so it does not allow the Threads to collide with each other
*/
