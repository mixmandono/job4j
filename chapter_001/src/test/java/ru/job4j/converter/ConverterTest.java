package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void when72RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(72);
        assertThat(result, is(1));
    }

    @Test
    public void when62RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(62);
        assertThat(result, is(1));

    }

    @Test
    public  void when1DollarToRubleThen62() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(1);
        assertThat(result, is(62));
    }

    @Test
    public  void when1EuroToRubleThen72() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(1);
        assertThat(result, is(72));
    }
}



