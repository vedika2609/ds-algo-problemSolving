package dsalgo.datastructures.arrays;

public class ClassObjectsForArrays {

    public static void main(String[] args) {
        int intArray[] = new int[3];
        byte byteArray[] = new byte[3];
        short shortArray[] = new short[3];
        String[] strArray = new String[3];

        System.out.println(intArray.getClass());
//        class [I
        System.out.println(intArray.getClass().getSuperclass());
//        class java.lang.Object
        System.out.println(byteArray.getClass());
//        class [B
        System.out.println(shortArray.getClass());
//        class [S
        System.out.println(strArray.getClass());
//        class [Ljava.lang.String;
    }
}
