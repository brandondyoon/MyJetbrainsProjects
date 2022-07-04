public class RefsAndMuts {
    public RefsAndMuts()
    {
        problem1();
    }
    public static void problem1()
    {
        String strOne = new String("Hello");
        String strTwo = strOne;
        StringBuffer sbOne = new StringBuffer("Hello");
        StringBuffer sbTwo = sbOne;

        strOne += " There";
        sbOne.append(" There");
        System.out.println("strOne: " + strOne);
        System.out.println("strTwo: " + strTwo);
        System.out.println("sbOne: " + sbOne);
        System.out.println("sbOne: " + sbTwo);
    }
}
