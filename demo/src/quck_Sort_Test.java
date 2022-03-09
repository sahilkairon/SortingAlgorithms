import java.util.Random;

public class quck_Sort_Test {


    static void swap(double [] arr, int i, int j)
    {
        double  temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static void dualPivotQuickSort(double[] arr,
                                   int low, int high)
    {

        if (low < high)
        {

            // piv[] stores left pivot and right pivot.
            // piv[0] means left pivot and
            // piv[1] means right pivot
            int[] piv;
            piv = partition(arr, low, high);

            dualPivotQuickSort(arr, low, piv[0] - 1);
            dualPivotQuickSort(arr, piv[0] + 1, piv[1] - 1);
            dualPivotQuickSort(arr, piv[1] + 1, high);
        }

    }

    static int[] partition(double [] arr, int low, int high)
    {

        if (arr[low] > arr[high])
            swap(arr, low, high);

        // p is the left pivot, and q
        // is the right pivot.
        int j = low + 1;
        int g = high - 1, k = low + 1;
        double  p = arr[low], q = arr[high];

        while (k <= g)
        {

            // If elements are less than the left pivot
            if (arr[k] < p)
            {
                swap(arr, k, j);
                j++;
            }

            // If elements are greater than or equal
            // to the right pivot
            else if (arr[k] >= q)
            {
                while (arr[g] > q && k < g)
                    g--;

                swap(arr, k, g);
                g--;

                if (arr[k] < p)
                {
                    swap(arr, k, j);
                    j++;
                }
            }
            k++;
        }
        j--;
        g++;

        // Bring pivots to their appropriate positions.
        swap(arr, low, j);
        swap(arr, high, g);

        // Returning the indices of the pivots
        // because we cannot return two elements
        // from a function, we do that using an array.

        return new int[] { j, g };


    }




    public static void main(String[] args) {
        double[] t = new double[100000];
        Random r = new Random();
        for (int i = 0; i < 100000; i++) {
            t[i] = r.nextInt();

        }
        stopwatch s = new stopwatch();
        dualPivotQuickSort(t, 0, 99999);
        s.end();
        System.out.println(s.getElapsedTime());






    }
}
