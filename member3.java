package thread;

import static thread.constant.withDraw;

public class member3 extends Thread{
 
    
    @Override
    public void run(){
        withDraw(300);
    }
}
