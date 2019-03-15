package lynx.singleton;

import java.util.ArrayList;
import java.util.List;

public class SingleTonThreadSafeDemo {

    public static void main(String[] args){
        int threadSize = 100;
        List<ThreadTester> tts = new ArrayList<ThreadTester>();
        for(int i = 0;i<=threadSize;i++) {
            ThreadTester tt = new ThreadTester();
            tts.add(tt);
        }
        try {
            Thread.sleep(1000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        for(int i =0;i<=threadSize;i++)
        {
           tts.get(i).start();
           if(i==0)
           {
           }
        }
    }
}

class SingleTonThreadSafe{
    private SingleTonThreadSafe(){}//suppress default constructor

    private static SingleTonThreadSafe instance;

    public static synchronized SingleTonThreadSafe getInstance() // do not put the lock here for a better performance;
    {
        if(instance == null)
        {
            // this may cause get null reference when multi thread are require to get the instance before it's lock is released the first time when instance is not created yet;
            synchronized(new Object())
            {
                instance = new SingleTonThreadSafe();
            }
        }
        return instance;
    }
    public void doSomething(){
        System.out.println("Hello from singleton!");
    }
}

class ThreadTester extends Thread{

    private  SingleTonThreadSafe instance;
    public void run(){
        instance = SingleTonThreadSafe.getInstance();
        if(instance!=null) {
            instance.doSomething();
        }
        else{
            System.out.println("failed to get instance");
        }
    }
}