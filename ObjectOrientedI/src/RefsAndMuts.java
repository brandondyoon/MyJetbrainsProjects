public class RefsAndMuts {
    public RefsAndMuts()
    {
        //problem1();
        problem234();
    }

    public static StringBuffer[] refCopy(StringBuffer[] arr)
    {
        StringBuffer[] copy = arr;
        return copy;
    }

    public static StringBuffer[] shallowCopy(StringBuffer[] arr)
    {
        StringBuffer[] copy = new StringBuffer[arr.length];
        for(int i = 0; i < copy.length; i++)
            copy[i] = arr[i];
        return copy;
    }

    public static StringBuffer[] deepCopy(StringBuffer[] arr)
    {
        StringBuffer[] copy = new StringBuffer[arr.length];
        for(int i = 0; i < copy.length; i++)
            copy[i] = new StringBuffer(arr[i]);
        return copy;
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

    public static void printArraySB(StringBuffer[] arr)
    {
        System.out.print("SB: ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print("`" + i + "`, ");
        }
        System.out.println("");
    }

    public static void problem234()
    {
        StringBuffer myArr[] = new StringBuffer[10];
        for(int i = 0; i < 10; i++)
        {
            myArr[i] = new StringBuffer("STR" + i);
        }

        StringBuffer[] myRefCopy = RefsAndMuts.refCopy(myArr);
        StringBuffer[] myShallowCopy = RefsAndMuts.shallowCopy(myArr);
        StringBuffer[] myDeepCopy = RefsAndMuts.deepCopy(myArr);

        System.out.print(myArr.hashCode() + " - ");
        RefsAndMuts.printArraySB(myArr);

        System.out.print(myRefCopy.hashCode() + " - ");
        RefsAndMuts.printArraySB(myRefCopy);

        System.out.print(myShallowCopy.hashCode() + " - ");
        System.out.print(myArr[0].hashCode() + " - ");
        System.out.print(myShallowCopy[0].hashCode() + " - ");
        RefsAndMuts.printArraySB(myShallowCopy);

        System.out.print(myDeepCopy.hashCode() + " - ");
        System.out.print(myArr[0].hashCode() + " - ");
        System.out.print(myDeepCopy[0].hashCode() + " - ");
        RefsAndMuts.printArraySB(myDeepCopy);
    }

    //
}