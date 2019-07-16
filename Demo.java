package thread;

import static thread.constant.balance;

public class Demo {

    public static void main(String[] args) throws InterruptedException {
        member1 t1 = new member1();
        member2 t2 = new member2();
        member3 t3 = new member3();
        member4 t4 = new member4();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        System.out.println(balance);

    }
}
