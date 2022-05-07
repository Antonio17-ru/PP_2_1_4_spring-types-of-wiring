package koschei.models;

import koschei.config.AppConfig;



public class Egg6 extends AppConfig {

    private final Needle7 needle;

    public Egg6(Needle7 needle) {
        this.needle = needle;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + needle.toString();
    }
}
