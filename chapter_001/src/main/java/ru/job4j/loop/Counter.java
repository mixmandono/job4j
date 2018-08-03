package ru.job4j.loop;

/**
 *
 *@author Pavel Kolos (pavelkolos777@gmail.com).
 *@version $Id$.
 *@since 03.08.2018
 */

public class Counter {
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}





