public class StringsPractice {
    StringsPractice(String[] args)
    {
        StringsPractice.doPractice(args);
    }

    public static void doPractice(String[] ins)
    {
        // 1
        String x = ins[0];
        String y = ins[1];
        if(x.equals(y))
        {
            System.out.println("the strings are equal");
        }
        else
        {
            System.out.println("the strings are not equal");
        }

        // 2
        System.out.println("The strings concatenated: " + x + y);
        // 3 and 5
        System.out.print("without println, you have to use print which doesn't add a newline. This is a newline: \n");
        // 4
        System.out.println("length of x: " + x.length());

        // 6
        int i = 69;
        int j = 15;
        String st = "Hello" + (i + j) + "There";
        System.out.println(st);

        // 7
        String greeting1 = new String("Hello");
        System.out.println(Integer.toHexString(greeting1.hashCode()) + ": " + greeting1);
        greeting1 += "There";
        System.out.println(Integer.toHexString(greeting1.hashCode()) + ": " + greeting1);

        // 8
        StringBuffer greeting2 = new StringBuffer("Hello");
        System.out.println(Integer.toHexString(greeting2.hashCode()) + ": " + greeting2);
        greeting2.append("There");
        System.out.println(Integer.toHexString(greeting2.hashCode()) + ": " + greeting2);

        // 9
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb + ": capacity " + sb.capacity());
        sb.append("There");
        System.out.println(sb + ": capacity " + sb.capacity());
        sb.replace(0, sb.length(), "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        System.out.println(sb + ": capacity " + sb.capacity());
    }
}
