package com.util.zerocell;

import com.creditdatamw.zerocell.annotation.Column;

import java.time.LocalDate;

public class TestData {

    //POJO - Plain Old java object

    @Column(name= "testcase", index = 0)
    private String testcase;

    @Column(name= "browser", index = 1)
    private String browser;

    @Column(name= "firstname", index = 2)
    private String firstname;

    @Column(name= "isFTE", index = 3, converterClass = StringToBooleanConverter.class)
    private Boolean isFTE;

    @Column(name= "age", index = 4, converterClass = StringToIntegerConverter.class)
    private int age;

    @Column(name= "date", index = 5, converterClass = StringToLocalDateConverter.class)
    private LocalDate date;


    @Column(name= "phonenumber", index = 6, converterClass = StringToPhonenumberConverter.class)
    private String phonenumber;

    @Override
    public String toString() {
        return "TestData{" +
                "testcase='" + testcase + '\'' +
                ", browser='" + browser + '\'' +
                ", firstname='" + firstname + '\'' +
                ", isFTE=" + isFTE +
                ", age=" + age +
                ", date=" + date +
                ", phonenumber='" + phonenumber + '\'' +
                '}';
    }
}


