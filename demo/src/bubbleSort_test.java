import java.lang.reflect.Array;
import java.util.Random;

public class bubbleSort_test {


        public void bubblesort(double arr[]){
            int n = arr.length;
            for(int i = 0; i< n -1; i++ ){
                for (int j = 0; j<n -i -1; j++){
                    if (arr[j] > arr[j+1]){
                        double temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }



        }

    public static void main(String[] args) {

        double[] t = new double[100000];
        Random  r = new Random();
        for(int i = 0; i<100000; i++){
            t[i] = r.nextInt();

        }

        stopwatch s = new stopwatch();
        bubbleSort_test tk = new bubbleSort_test();
        tk.bubblesort(t);

        s.end();
        System.out.println(s.getElapsedTime());


    }
}
