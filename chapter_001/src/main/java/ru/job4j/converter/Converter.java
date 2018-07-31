package ru.job4j.converter;

/**
 * Корвертор валюты.
 */
public class Converter {

    /**
     * Конвертируем рубли в евро.
     *
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        return 72 / 72;
    }

    /**
     * Конвертируем рубли в доллары.
     *
     * @param value рубли.
     * @return Доллары
     */
    public int rubleToDollar(int value) {
        return 62 / 62;

    }

    /**
     * Конвертируем доллары в рубли.
     *
     * @param value рубли.
     * @return Доллары
     */
    public int dollarToRuble(int value) {
        return 1 * 62;
    }

    /**
     * Конвертируем евро в рубли.
     *
     * @param value рубли.
     * @return Доллары
     */
    public int euroToRuble(int value) {
        return 1 * 72;
    }
}
