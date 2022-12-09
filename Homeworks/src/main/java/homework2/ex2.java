package homework2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.logging.Logger;

// https://www.javatpoint.com/bubble-sort-in-java
public class ex2 {
    /**
     * Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
     */

    private static Logger logger = Logger.getLogger(ex2.class.getName());
    public static void main(String[] args) {

        int arr[] ={3,60,35,2,45,320,5};

        try(PrintWriter out = new PrintWriter("bubbleSort.txt")) {

            int n = arr.length;
            int temp = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < n-i; j++) {
                    if (arr[j-1] > arr[j]){
                        temp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = temp;
                    }
                }
                out.println(Arrays.toString(arr));
            }

            logger.info("Содержимое текущих папок записано в файл bubbleSort.txt");
        } catch (FileNotFoundException e) {
            logger.info(e.getMessage());
        }

    }
}
