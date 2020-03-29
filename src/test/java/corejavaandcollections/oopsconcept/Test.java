package corejavaandcollections.oopsconcept;

public class Test {

    public static void main(String[] args) {
        ClassA obj1 = new ClassA();
        ClassB obj2 = new ClassB();
        ClassA obj3 = new ClassB();
//        ClassB obj4 = new ClassA();

        obj1.print();
        obj2.print();
        obj3.print();


    }
}
