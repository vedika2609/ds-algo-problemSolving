package dsalgo.algos.problemsolving;

import java.util.*;
import java.util.stream.Collectors;

public class RoadRepair {

    public static void main(String[] args) {
        List<Integer> crewId = new LinkedList<>(Arrays.asList(5, 1, 4, 2));
        List<Integer> jobId = new LinkedList<>(Arrays.asList(4, 7, 9, 10));

        int distance = 0;

        Map<Integer, Integer> mapping = new HashMap<>();

        List<Integer> list = crewId.stream()
                .filter(jobId::contains)
                .collect(Collectors.toList());

        crewId.removeAll(list);
        jobId.removeAll(list);

        for (int i : list) {
            mapping.put(i, i);
        }

        int size = crewId.size();

        crewId.sort(Comparator.naturalOrder());
        jobId.sort(Comparator.naturalOrder());
        for (int i = 0; i < size; i++) {
            mapping.put(crewId.get(i), jobId.get(i));
        }

        for (int i : mapping.keySet()) {
            distance += Math.abs(i - mapping.get(i));
        }
        System.out.println(distance);
    }
}
