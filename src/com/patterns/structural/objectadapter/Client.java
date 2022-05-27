package com.patterns.structural.objectadapter;

import java.time.LocalDate;

/**
 * Created by sridharrajagopal on 5/27/22.
 */
public class Client {
    public void doAnalysisAndOperation(XmlConvertable xmlConvertable) {
        System.out.println("Doing existing operations before calling new service via adapter..");
        XmlClass xmlClass = new XmlClass();
        xmlClass.setName("Sridhar");
        xmlClass.setSalary(2500000);
        xmlClass.setDateOfBirth(LocalDate.of(1987, 9, 24));
        xmlConvertable.fetchDataFromLib(xmlClass);
    }
}
