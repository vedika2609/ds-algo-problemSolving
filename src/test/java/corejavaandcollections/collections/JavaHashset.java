package corejavaandcollections.collections;

class JavaHashset {
    int number;
}

class Test {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int x = 0;
        JavaHashset p = new JavaHashset();
        new Test().doIt(x, p);
        System.out.println(x + " " + p.number);
    }

    private void doIt(int i, JavaHashset p) {
        i = 5;
        p.number = 8;
    }

}
