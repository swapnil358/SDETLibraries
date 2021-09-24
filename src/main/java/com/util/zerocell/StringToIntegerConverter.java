package com.util.zerocell;

import com.creditdatamw.zerocell.converter.Converter;

public class StringToIntegerConverter implements Converter<Integer> {
    @Override
    public Integer convert(String value, String columnname, int rownumber) {
        return Integer.valueOf(value);
    }
}
