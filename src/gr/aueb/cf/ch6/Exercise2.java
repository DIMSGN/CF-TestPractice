package gr.aueb.cf.ch6;

public class Exercise2 {
    public static void main(String[] args) {

    String s = "abc";
        System.out.println(repeat1(s, 5));
        System.out.println(repeat2(s, 10));

    }

    public static String repeat1(String s, int n) {
        return s.repeat(n);
    }

    public static String repeat2(String s, int n) {
        int times;

        times = (int)Math.ceil((double) n / s.length());
        return s.repeat(times);
    }
}
