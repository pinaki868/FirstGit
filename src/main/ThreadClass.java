package main;
import main.Base;

public class ThreadClass extends Thread{

    public String browserName;
    Base base;

    public ThreadClass(String browserName, String thread){
     super(thread);
     this.browserName = browserName;
    }

    @Override
    public void run(){

        System.out.println("thread--started " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ;
       // Base.initializeBrowser(this.browserName);
    }

}
