import java.util.Arrays;
import java.util.ArrayList;

public class DataStructures2D {
    public DataStructures2D()
    {
        int[][] raggedArray = DataStructures2D.bigRaggedArray(50);
        DataStructures2D.printOut(raggedArray);

        int[][] numberGrid = {
            { 9, 2,  8, 1},
            { 7, 3,  4, 6},
            { 4, 3,  2, 1},
            {12, 2, 11, 5},
        };
        System.out.println("Sum of grid: " + DataStructures2D.sumInts(numberGrid));

        int[][] copyOfMatrix = DataStructures2D.makeCopy(raggedArray);

        ArrayList<ArrayList<Integer>> test = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < numberGrid.length; i++)
        {
            test.add(new ArrayList<Integer>(numberGrid[i].length));
            for(int j = 0; j < numberGrid[i].length; j++)
            {
                test.get(i).add(numberGrid[i][j]);
            }
        }
        ArrayList<ArrayList<Integer>> newCopy = DataStructures2D.makeCopy(test);
        System.out.println("Sum of grid: " + DataStructures2D.sumInts(newCopy));

        DataStructures2D.printOut(copyOfMatrix);
    }

    public static void printOut(int[][] matrix)
    {
        for(int i = 0; i < matrix.length; i++)
        {
            System.out.println(i + ": " + Arrays.toString(matrix[i]));
        }
    }

    public static int[][] bigRaggedArray(int sizeofArray)
    {
        int[][] ragged = new int[sizeofArray][];
        for(int i = 0; i < sizeofArray; i++)
        {
            ragged[i] = new int[i];
        }
        return ragged;
    }

    public static int sumInts(int[][] grid)
    {
        int sum = 0;
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[i].length; j++)
            {
                sum += grid[i][j];
            }
        }
        return sum;
    }

    public static int[][] makeCopy(int[][] orig)
    {
        int[][] retval = new int[orig.length][];
        for(int i = 0; i < retval.length; i++)
        {
            retval[i] = new int[orig[i].length];
            for(int j = 0; j < retval[i].length; j++)
            {
                retval[i][j] = orig[i][j];
            }
        }
        return retval;
    }

    public static int sumInts(ArrayList<ArrayList<Integer>> grid)
    {
        int sum = 0;
        for(int i = 0; i < grid.size(); i++)
        {
            for(int j = 0; j < grid.get(i).size(); j++)
            {
                sum += grid.get(i).get(j);
            }
        }
        return sum;
    }

    public static ArrayList<ArrayList<Integer>> makeCopy(ArrayList<ArrayList<Integer>> orig)
    {
        ArrayList<ArrayList<Integer>> retval = new ArrayList<ArrayList<Integer>>(orig.size());
        for(int i = 0; i < orig.size(); i++)
        {
            retval.add(i, new ArrayList<Integer>());
            for(int j = 0; j < orig.get(i).size(); j++)
            {
                retval.get(i).add(j, orig.get(i).get(j));
            }
        }
        return retval;
    }
}
