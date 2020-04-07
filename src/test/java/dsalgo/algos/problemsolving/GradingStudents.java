package dsalgo.algos.problemsolving;

import java.util.ArrayList;
import java.util.List;

class GradingStudents {
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);
        List<Integer> result = new ArrayList<>();
        for (int grade : grades) {
            if (grade >= 38 && (5 - grade % 5) < 3) {
                grade = grade + 5 - grade % 5;
            }
            result.add(grade);
        }
        System.out.println(result);
    }
}
