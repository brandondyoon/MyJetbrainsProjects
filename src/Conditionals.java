import java.util.Scanner;

public class Conditionals {
    public Conditionals()
    {
        Conditionals.problem1();
        Conditionals.problem2();
        System.out.println(Conditionals.problem3(07.0f));
    }

    public static void problem1()
    {
        Scanner sc = new Scanner(System.in);
        float temp = Float.parseFloat(sc.nextLine());
        String userInput;
        char scale;
        float convertedTemp;
        while(true) {
            userInput = sc.nextLine();
            scale = userInput.charAt(0);
            // temp is in Fahrenheit
            if(scale == 'F')
            {
                convertedTemp = (5.0f/9.0f) * (temp - 32.0f);
                break;
            }
            // temp is in Celsius
            else if(scale == 'C')
            {
                convertedTemp = (9.0f/5.0f) * temp + 32.0f;
                break;
            }
            else
            {
                continue;
            }
        }
        System.out.println("Converted temperature: " + convertedTemp);
    }

    public static void problem2()
    {
        String[] aKeywords = {"dog", "cat", "cockatiel"};
        int[]    aPaths    = { 0b10,  0b01,        0b11};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a type of pet");
        String animal = sc.nextLine();

        // Detect which animal it is and set up which questions to ask
        int pathCode = 0b00;
        for(int i = 0; i < aKeywords.length; i++)
        {
            if(aKeywords[i].equals(animal))
            {
                pathCode = aPaths[i];
            }
        }

        int nCats = 0;
        int nDogs = 0;

        if(pathCode == 0b00)
        {
            System.out.println("I have no further questions");
            return;
        }
        if((pathCode & 0b10) != 0)
        {
            System.out.println("How many cats has it eaten this year?");
            nCats = Integer.parseInt(sc.nextLine());
        }
        if((pathCode & 0b01) != 0)
        {
            System.out.println("How many dogs has it scratched this year?");
            nDogs = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Species: " + animal);
        System.out.println("Number of cats eaten: " + nCats);
        System.out.println("Number of dogs scratched: " + nDogs);
    }

    public static char problem3(float score)
    {
        if(score >= 90.0)
            return 'A';
        else if(score >= 80.0)
            return 'B';
        else if(score >= 70.0)
            return 'C';
        else if(score >= 60.0)
            return 'D';
        else
            return 'F';
    }
}
