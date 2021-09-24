package com.util.zerocell;

import com.creditdatamw.zerocell.converter.Converter;

import java.time.LocalDate;

public class StringToLocalDateConverter implements Converter<LocalDate> {
    @Override
    public LocalDate convert(String s, String s1, int i) {
        //write your logic to localdateformatter
        return LocalDate.now();
    }
}
