package corejavaandcollections.strings;

public class LexicographicalOrderMethod2 {

    public static void main(String[] args) {
        String s = "welcometojava";
        int k = 3;

        String currentString = s.substring(0, k);
        String lexMin = currentString;
        String lexMax = currentString;

        for (int i = k; i < s.length(); i++) {
            currentString = currentString.substring(1, k) + s.charAt(i);
            if (lexMax.compareTo(currentString) < 0)
                lexMax = currentString;
            if (lexMin.compareTo(currentString) > 0)
                lexMin = currentString;
        }
        System.out.println(lexMin);
        System.out.println(lexMax);
//        List<String> stringList = new ArrayList<String>();
//        SortedSet<String> sets = new TreeSet<String>();
//        for(int i=0; i<s.length()-k+1; i++){
//            stringList.add(s.substring(i, i+k));
//            sets.add(s.substring(i, i+k));
//    }
//        System.out.println(sets.first() + "\n" + sets.last());

    }


}
