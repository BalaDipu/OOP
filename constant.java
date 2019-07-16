
package thread;

import java.util.logging.Level;
import java.util.logging.Logger;


public final class constant {
      public static int balance =10000;
    
     public static synchronized void withDraw(int amount) {  
        balance -= amount;
    }
}
