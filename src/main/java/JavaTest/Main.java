package JavaTest;

class Base {
    static int static_method()   { return 1; }
           int instance_method() { return 2; }

    static int static_property   = 5;
           int instance_property = 6;

    static String static_ref_property   = "9";
           String instance_ref_property = "10";
}

public class Main extends Base {
    static int static_method()   { return 3; }
           int instance_method() { return 4; }

    static int static_property   = 7;
           int instance_property = 8;

    static String static_ref_property   = "11";
           String instance_ref_property = "12";

    public static void main(String[] args) {
        Base b = new Main();
        Main s = new Main();

        System.out.println(b.static_method()   + ", " + s.static_method());
        System.out.println(b.instance_method() + ", " + s.instance_method());

        System.out.println(b.static_property   + ", " + s.static_property);
        System.out.println(b.instance_property + ", " + s.instance_property);

        System.out.println(b.static_ref_property   + ", " + s.static_ref_property);
        System.out.println(b.instance_ref_property + ", " + s.instance_ref_property);
    }
}