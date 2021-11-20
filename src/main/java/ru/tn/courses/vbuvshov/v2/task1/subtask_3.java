package ru.tn.courses.vbuvshov.v2.task1;
import java.util.Arrays;
public class subtask_3
{
    public static void main(String[] args)
    {
        sortirovka();
    }

        private static void  sortirovka()
        {
        int[] Mas = {41,32,46,7,53,311,1,85,34,6};
        System.out.print("Данный массив = ");
        for (int aMas : Mas) System.out.print(aMas + " ");
        int count = 0;
        System.out.print("счетчик равен ");
        System.out.print(count);
        for (int i = 0; i < Mas.length - 1; i++)
            for (int j = 0; j < Mas.length - i - 1; j++)
                if (Mas[j] < Mas[j+1])
                {
                    int temp = Mas[j];
                    Mas[j] = Mas[j+1];
                    Mas[j+1] = temp;
                    count++;
                }
        System.out.print(" конечный массив = ");
        for (int aMas : Mas) System.out.print(aMas + " ");
        System.out.print("счетчик равен = ");
        System.out.print(count);
        }
}

