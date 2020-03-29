package corejavaandcollections.oopsconcept;

class B extends A {
    private B() {
        System.out.println("Inside child class");
    }

    public static void main(String[] args) {
        B b = new B();
    }
}
