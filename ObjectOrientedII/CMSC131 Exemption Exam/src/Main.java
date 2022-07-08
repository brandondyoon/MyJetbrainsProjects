import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        //computeSum(6, 2, 4);
        //drawShape(7);

        //testStatements();
        //System.out.println(getNDivisibleBy7And9(2));
        //questionSeven();
        //WaterBed.test();
        //ExceptionQuestion.start();

        /*int[] a = {2, 7};
        int[] dub = doubleArray(a);
        for(int i : dub)
        {
            System.out.println(i);
        }*/

        System.out.println(removeChar("Communist Manifesto", 'n'));
    }
    public static void computeSum(int limit, int a, int b)
    {
        int sum = 0;
        for(int i = 1; i <= limit; i++)
        {
            if(i % a == 0) {
                sum += i;
            }
            else if(i % b == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static void drawShape(int n)
    {
        for(int i = n, k = 0; i > 0; i--, k++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print(k % 2 == 0 ? "*" : "#");
            }
            System.out.println("");
        }
    }

    public static void testStatements()
    {
        //System.out.println(20 / 3);
        //System.out.println(20 % 3);
        String a = "car";
        String b = new String("car");
        System.out.println( (a != b) ? 111 : 22);
        System.out.println( a.compareTo(b));
        int size = 15, length = 20;
        if (size >= 10 || length-- >= 9) {
            System.out.println("size: " + size);
        }
        System.out.println("length: " + length);

        for (int i = 1; i <= 30; i++) {
            if (i <= 15) {
                continue;
            }

            if (i == 20) {
                break;
            }
            System.out.println(i);
        }
    }

    public static boolean isDivisibleBy7And9(int value)
    {
        if(value % 63 == 0)
            return true;
        else
            return false;
    }

    public static int getNDivisibleBy7And9(int n)
    {
        int i = 0;
        int rank = 0;
        while(rank < n)
        {
            i++;
            if(isDivisibleBy7And9(i))
            {
                rank++;
            }
        }
        System.out.println("Number of operating telephones: " + Telephone.getTelephoneCount());
        return i;
    }

    public static void questionSix()
    {
        ArrayList<Double> myList = new ArrayList<Double>();
        for(int i = 0; i < 4; i++)
        {
            myList.add((Double)0.1 * i);
        }
        for(Double d : myList)
        {
            System.out.println(d);
        }
    }

    public static void questionSeven()
    {
        float a = 1.0f, b = .90f;
        if (a - b == .10f) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
        System.out.println(1.0f - .90f);
    }

    public static int[] doubleArray(int[] a)
    {
        int[] retval = new int[a.length * 2];
        for(int i = 0; i < a.length; i++)
        {
            retval[i] = a[i];
            retval[a.length + i] = 2*a[i];
        }
        return retval;
    }

    public static String removeChar(String str, char target)
    {
        if(str.length() == 0)
            return "";
        if(str.charAt(0) == target)
            return removeChar(str.substring(1), target);
        else
            return str.charAt(0) + removeChar(str.substring(1), target);
    }
}
