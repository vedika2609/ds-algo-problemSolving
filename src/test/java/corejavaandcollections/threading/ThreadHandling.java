package corejavaandcollections.threading;

import org.testng.Assert;
import org.testng.annotations.Test;

class ThreadHandling implements Runnable {
    private Thread t;
    private String threadName;

    ThreadHandling(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        while (true)
            System.out.print(threadName);
    }

    void start() {
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

    @Test
    public void test() {
        String test = "TEST";
        Assert.assertEquals(3, test.length());
    }
}
