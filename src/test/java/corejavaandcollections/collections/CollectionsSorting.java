package corejavaandcollections.collections;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

public class CollectionsSorting {
    //Complete the code
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList, Comparator.comparing(Student::getCgpa).reversed()
                .thenComparing(Student::getFname)
                .thenComparing(Student::getId));

        studentList.stream().sorted(Comparator.comparingDouble(Student::getCgpa).reversed().thenComparing(Student::getFname).thenComparingInt(Student::getId)).map(Student::getFname).forEach(System.out::println);

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }

    @Getter
    @Setter
    static class Student {
        private int id;
        private String fname;
        private double cgpa;

        Student(int id, String fname, double cgpa) {
            super();
            this.id = id;
            this.fname = fname;
            this.cgpa = cgpa;
        }
    }
}