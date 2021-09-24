package com.util.zerocell;

import com.creditdatamw.zerocell.converter.Converter;

public class StringToPhonenumberConverter implements Converter<String> {
    @Override
    public String convert(String value, String s1, int i) {
        return value.startsWith("+91")? value:"+91"+value;
    }
}
