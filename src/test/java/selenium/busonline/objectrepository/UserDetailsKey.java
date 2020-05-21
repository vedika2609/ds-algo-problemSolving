package selenium.busonline.objectrepository;

import lombok.Getter;

public enum UserDetailsKey {

    FULL_NAME("Full name*"),
    MOBILE_NO("Mobile no*"),
    EMAIL("Email*"),
    RE_ENTER_EMAIL("Re-enter email*");

    @Getter
    private String label;

    UserDetailsKey(String label) {
        this.label = label;
    }
}