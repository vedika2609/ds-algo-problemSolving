package corejavaandcollections.strings;

public class TwoStrings {
    public static void main(String[] args) {
        String s1 = "writetoyourparents";
        String s2 = "fghmqzldbc";
        System.out.println(twoStrings(s1, s2));
    }

    private static String twoStrings(String s1, String s2) {
//        for(int i=1; i<s1.length(); i++){
//            if (s2.contains(s1.substring(i, i+1)))
//                return "YES";
//        }
//        return "NO";
        for (char c : (s1 + s2).toCharArray()) {
            if (s1.indexOf(c) == -1 && s2.indexOf(c) == -1)
                return "YES";
        }
        return "NO";
    }
}