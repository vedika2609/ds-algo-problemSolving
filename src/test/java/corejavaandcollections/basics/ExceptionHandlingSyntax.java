package corejavaandcollections.basics;

public class ExceptionHandlingSyntax {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        try {
            badMethod();
            System.out.println("A");

        } catch (RuntimeException ex) {
            System.out.println("B");
        } catch (Exception ex1) {
            System.out.println("C");
        } finally {
            System.out.println("D");
        }

        System.out.println("E");
    }

    private static void badMethod() {
        throw new RuntimeException();
    }

}
