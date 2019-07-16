package thread;

import static thread.constant.withDraw;

public class member4 extends Thread{
   
    @Override
    public void run(){
       withDraw(500);
    }
}
