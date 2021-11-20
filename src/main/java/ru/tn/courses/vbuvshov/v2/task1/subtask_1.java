package ru.tn.courses.vbuvshov.v2.task1;
import java.util.ArrayList;
import java.util.Arrays;
public class subtask_1
{
    public static void main(String[] args)
    {
        int arr[] = gArr(0, 4, 0, 7, 0, 32, 1, 6, 0);

        for (int anArr : arr) System.out.print(anArr + " ");
    }

    private static int[] gArr(int ... nums)
    {
        ArrayList<Integer> Nam = new ArrayList<>();
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 0) Nam.add(i);
        }

        int arr[] = new int[Nam.size()];

        for (int i = 0; i < Nam.size(); i++) arr[i] = Nam.get(i);

        return arr;
    }


}


