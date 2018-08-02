package ru.job4j.max;

public class Max {
    public int max(int first, int second) {
        int result = first < second ? second: first;
        return result; }

    public int summation(int first, int second) {
        return first + second;
    }

    public int max(int first, int second, int third) {
        return first < second? third : second;
    }
    }


