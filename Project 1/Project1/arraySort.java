import java.util.*;

/**
 * To sort a Array using Array.Sort() of the util package.
 *
 * @author (Sayan)
 * @version (1.0.0.1)
 */
public class arraySort
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class arraySort
     */
    public arraySort()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * Sort a Array fully in ascending order
     *
     * @param  arr[]  a array to sort
     * @void    print the sorted Array
     */
    public void sortArrayFullAsc(int arr[])
    {
            Arrays.sort(arr);
     
            System.out.printf("Modified arr[] : %i",
                              Arrays.toString(arr));
    }
    /**
     * Sort an Array fully partially
     *
     * @param  arr[]  a array to sort
     * @param  start  start of the sort
     * @param  end  end of the sort
     * @void    print the sorted Array
     */
    public void sortArrayPartAsc(int arr[], int start,int end)
    {
        Arrays.sort(arr,start, end);
 
        System.out.printf("Modified arr[] : %i",
                          Arrays.toString(arr));
    }
    int[] bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        return arr;
            }            
    }