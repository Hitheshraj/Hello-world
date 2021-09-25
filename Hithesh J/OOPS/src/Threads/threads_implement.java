package Threads;

import org.w3c.dom.ls.LSOutput;

/*Below is example for implement class
 here we can implement on many class*/

class threads_implement  implements Runnable {
     public void run(){
         System.out.println("Example for implements");
         try {
             throw new Exception("Example for excetion");
         } catch (Exception e) {
             System.out.println(e);
             e.printStackTrace();
         }
     }

     public static void main(String[] args) {
         threads_implement obj = new threads_implement();
         Thread obj1 = new Thread(obj);
         obj1.start();
     }
}
