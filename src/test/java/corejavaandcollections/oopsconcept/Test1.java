package corejavaandcollections.oopsconcept;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) {

        System.out.println("Hello World");

        Pattern pattern = Pattern.compile(".*\\[key=.*\\]", Pattern.CASE_INSENSITIVE);
//            Pattern pattern = Pattern.compile(".*Asset.*",Pattern.CASE_INSENSITIVE);
        String msg = "targetingAsset.targetingValues.INTERESTS[key=20003]";
        Matcher m = pattern.matcher(msg);
        System.out.println(m.matches());
    }

}