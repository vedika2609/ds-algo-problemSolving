package corejavaandcollections.threading;

public class TestThread {
    public static void main(String[] args) {
        ThreadHandling A = new ThreadHandling("A");
        ThreadHandling B = new ThreadHandling("B");
        B.start();
        A.start();
    }
}
