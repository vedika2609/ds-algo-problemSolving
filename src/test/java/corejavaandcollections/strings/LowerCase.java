package corejavaandcollections.strings;

import org.apache.commons.lang3.StringUtils;

public class LowerCase {

    public static void main(String[] args) {
        String s = "TWITTER";
        System.out.println(StringUtils.capitalize(s));
        System.out.println(StringUtils.capitalize(s.toLowerCase()));
    }
}
