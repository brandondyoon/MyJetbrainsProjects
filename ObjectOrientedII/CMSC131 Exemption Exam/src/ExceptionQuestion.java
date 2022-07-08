public class ExceptionQuestion {
    public static void evalValue(int x) {
        if (x >= 0 && x <= 50) {
            throw new IllegalArgumentException();
        } else if (x > 50 && x <= 100) {
            throw new ArithmeticException();
        } else {
            System.out.println("Good");
        }
        System.out.println("evalValueEnd");
    }

    public static void proc(int x) {
        try {
            evalValue(x);
        } catch (IllegalArgumentException e) {
            System.out.println("B");
        } catch (ArithmeticException e) {
            System.out.println("C");
        } finally {
            System.out.println("F");
        }
        System.out.println("procEnd");
    }

    public static void start() {
        proc(40);
        System.out.println("***");
        proc(80);
        System.out.println("***");
        proc(120);
    }
}
