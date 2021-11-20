package ru.tn.courses.vbuvshov.v2.task1;
import java.util.Arrays;
public class subtask_2
{
    public static void main(String args[])
    {
        double mas[] = {67.2, 68.05, 65.2, 67, 68.55, 67.45};
        double max = 0;
        int Num = 0;
        for (int i = 0; i < mas.length; i++)
        {
            if (mas[i] > max)
            {
                max = mas[i];
                Num = i;
            }
        }

        System.out.println("Наилучший курс на данный момент в банке № = ");
        System.out.println(Num);
    }

}
