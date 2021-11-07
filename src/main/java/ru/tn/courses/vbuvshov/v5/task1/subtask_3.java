package ru.tn.courses.vbuvshov.v5.task1;
import java.util.Arrays;
public class subtask_3
{
    public static void main(String[] args)
    {
        double[] calibres = new double[]{5.23, 7.15, 2.56, 12.7, 12.13, 43.43, 6.2, 5, 2.7};

        sortShell(calibres);

        for (double num : calibres)
        {
            System.out.println(num);
        }
    }

    private static void sortShell(double[] arr)
    {
        for (int i = 0; i < arr.length - 1; )
        {
            if (arr[i] > arr[i + 1])
            {
                double temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                if (i != 0) i--;
            }
            else if (i != arr.length - 1) i++; // сдвигаемся на 1 элемент вперёд
        }
    }
}
