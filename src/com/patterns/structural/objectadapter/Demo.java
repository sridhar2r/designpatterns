package com.patterns.structural.objectadapter;

import java.time.LocalDate;
import java.time.Period;

/**
 * Created by sridharrajagopal on 5/27/22.
 */
public class Demo {
    public static void main(String[] args) {
        XmlConvertable xmlConvertable = new XmlToJsonAdapter();
        Client client = new Client();
        client.doAnalysisAndOperation(xmlConvertable);

    }
}
