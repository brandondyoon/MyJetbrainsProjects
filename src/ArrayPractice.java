import java.util.Scanner;
import java.util.Arrays;

public class ArrayPractice {
    public ArrayPractice(int[] numbers)
    {
        ArrayPractice.problem1();
        ArrayPractice.setTo5(numbers);
        System.out.println(numbers[0]);
        /*int[] refNumbers = numbers;

        System.out.println(numbers.hashCode());
        System.out.println(refNumbers.hashCode());
        ArrayPractice.arrayDuplicator(refNumbers);
        System.out.println(refNumbers.hashCode());
        for(int i = 0; i < refNumbers.length; i++)
        {
            System.out.println(refNumbers[i]);
        }*/
    }
    public static void problem1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many ints u want fam?");
        int sizeofArray = Integer.parseInt(sc.nextLine());
        int[] myArray = new int[sizeofArray];
        for(int i = 0; i < sizeofArray; i++)
        {
            myArray[i] = Integer.parseInt(sc.nextLine());
        }
        for(int i = myArray.length-1; i >= 0; i--)
        {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
    }

    public static void setTo5(int[] givenArray)
    {
        for(int i = 0; i < givenArray.length; i++)
        {
            givenArray[i] = 5;
        }
        //Arrays.fill(givenArray, 5);
    }

    // Turns out I was right - this thing isn't actually possible
    /*public static void arrayDuplicator(int[] origArray)
    {
        int[] backupArray = new int[origArray.length];
        System.arraycopy(origArray, 0, backupArray, 0, origArray.length);
        origArray = new int[backupArray.length * 2];
        for(int i = 0; i < backupArray.length; i++)
        {
            origArray[i] = backupArray[i];
            origArray[backupArray.length + i] = backupArray[i];
        }
    }*/
}
