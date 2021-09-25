package Threads;
/*The method Sleep is used to sleep a Thread for the Specified amount of time
 **/
public class Sleep_Thread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            try{
                Thread.sleep(500);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Sleep_Thread T1 = new Sleep_Thread();
        Sleep_Thread T2 = new Sleep_Thread();
        T1.start();
        T2.start();
    }
}
