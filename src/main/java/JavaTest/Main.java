package JavaTest;

class Base {
    public static int static_method()   { return 1; }
    public        int instance_method() { return 2; }

    public static int static_property = 5;
    public        int instance_property = 6;
}

public class Main extends Base {
    public static int static_method()   { return 3; }
    public        int instance_method() { return 4; }

    public static int static_property = 7;
    public        int instance_property = 8;

    public static void main(String[] args) {
        Base b = new Main();
        Main s = new Main();

        System.out.println(b.static_method()   + ", " + s.static_method());
        System.out.println(b.instance_method() + ", " + s.instance_method());

        System.out.println(b.static_property   + ", " + s.static_property);
        System.out.println(b.instance_property + ", " + s.instance_property);
    }
}