package studenttask;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void InsertionSort(int[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            if (array[i] > array[i + 1]) {
                int a = 0;
                a = array[i];
                array[i] = array[i + 1];
                array[i + 1] = a;
                if (i != 0) {
                    if ((array[i - 1] > array[i])) {
                        int b = 0;
                        b = array[i - 1];
                        array[i - 1] = array[i];
                        array[i] = b;
                    }
                }
            }
        }
        for (int aarray : array) {
            System.out.print(aarray + " ");
        }
    }


    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        Calendar date1 = new GregorianCalendar(2003, 6, 25);
        Calendar date2 = new GregorianCalendar(2003, 4, 15);
        Calendar date3 = new GregorianCalendar(2002, 6, 14);
        Calendar date4 = new GregorianCalendar(2001, 1, 23);
        Calendar date5 = new GregorianCalendar(1998, 3, 26);
        Student[] sts = new Student[5];
        sts[0] = new Student(7, date1);
        sts[1] = new Student(3, date2);
        sts[2] = new Student(2, date3);
        sts[3] = new Student(6, date4);
        sts[4] = new Student(5, date5);


        int[] arrayOfIds = new int[5];
        for (int i = 0; i < 5; i++) {
            arrayOfIds[i] = sts[i].idNumber;
        }


        InsertionSort(arrayOfIds);

    }
}