package Threads;
/*Here every Thread runs in different stack space
|      |   |        |    |         |
|      |   |        |    |         |
|_Main_|   |__run()-|    |__run()__|
 Each Thread run in a separate callstack
 */
 class Multiple_Threads extends Thread{
    public void run(){
        try{
            Thread.sleep(50);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Task one");
        for(int i=0;i<10;i++){
            System.out.println("The loop lines of 1 are:"+i);
        }
        notify();
    }
}
class simple extends Thread {
     public void run(){
         try{
             Thread.sleep(50);
         }
         catch (Exception e){
             System.out.println(e);
         }
       //  System.out.println("Task two");
         for(int i=0;i<10;i++){
             System.out.println("The loop lines of 2 are:"+i);
         }
         try {
             wait();
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
}
class TestMultitasking{
    public static void main(String[] args) {
        Multiple_Threads T1 = new Multiple_Threads();
        simple T2 = new simple();
        T1.start();
        T2.start();
    }
}
