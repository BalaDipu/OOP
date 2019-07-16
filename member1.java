
package thread;

import static thread.constant.withDraw;

public class member1 extends Thread{
  
    @Override
    public void run(){
        withDraw(100);
    }
   
}
