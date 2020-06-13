package dsalgo.algos.problemsolving;

import java.util.*;

public class ActiveTraders {
    public static void main(String[] args) {
        List<String> customers = Arrays.asList("Omega", "Alpha", "Omega", "Alpha", "Omega", "Alpha", "Omega", "Alpha", "Omega", "Alpha", "Omega", "Alpha", "Omega", "Alpha", "Omega", "Alpha", "Omega", "Alpha", "Omega", "Beta");

        int n = customers.size();
        List<String> activeCustomer = new ArrayList<>();

        Map<String, Integer> map = new HashMap<>();

        for (String customer : customers) {
            if (map.containsKey(customer)) {
                map.put(customer, map.get(customer) + 1);
            } else {
                map.put(customer, 1);
            }
        }
        for (String customer : map.keySet()) {
            if (map.get(customer) * 100 / n >= 5) {
                activeCustomer.add(customer);
            }
        }

        activeCustomer.sort(String.CASE_INSENSITIVE_ORDER);
    }
}
