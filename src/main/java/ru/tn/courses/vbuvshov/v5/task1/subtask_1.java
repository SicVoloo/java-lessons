package ru.tn.courses.vbuvshov.v5.task1;
import java.util.Arrays;
public class subtask_1
{
    public static void main(String[] args)
    {
        System.out.print("Заданный массив: ");
        int arr[] = {1, 232, 10, 2, 15, 31, 7, 56, 32, 3, 14};
        for (int anArr : arr) System.out.print(anArr + " ");
        int count = 0;
        int[] evenArr = new int[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 0)
            {
                evenArr = Arrays.copyOf(evenArr, evenArr.length + 1);
                evenArr[count++] = arr[i];
            }
        }
        System.out.print("-----> ");
        System.out.print(" Массив четных чисел: ");
        for (int anArr : evenArr) System.out.print(anArr + " ");
        if (evenArr.length == 0)
            throw new IllegalArgumentException("Четных чисел нет!");

    }
}


