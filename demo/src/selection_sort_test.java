import java.util.Random;

public class selection_sort_test {

    public void selectionSort(double[] arr){
        stopwatch s = new stopwatch();
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {

            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;


            double temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        s.end();
        System.out.println(s.getElapsedTime());
    }

    public static void main(String[] args) {
        double[] t = new double[100000];
        Random r = new Random();
        for(int i = 0; i<100000; i++){
            t[i] = r.nextInt();

        }

         selection_sort_test tk = new selection_sort_test();
       tk.selectionSort(t);

    }
    }

