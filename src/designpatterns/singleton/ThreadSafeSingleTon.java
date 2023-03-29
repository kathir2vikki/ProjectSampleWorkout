package designpatterns.singleton;

public class ThreadSafeSingleTon {


    private static ThreadSafeSingleTon threadSafeSingleTon;

    private ThreadSafeSingleTon(){}

    public static ThreadSafeSingleTon getThreadSafeSingleTon()
    {
        if(threadSafeSingleTon ==null)
        {
            synchronized (ThreadSafeSingleTon.class)
            {
                if(threadSafeSingleTon == null)
                {
                    return new ThreadSafeSingleTon();
                }

            }
        }
        return threadSafeSingleTon;
    }
}
