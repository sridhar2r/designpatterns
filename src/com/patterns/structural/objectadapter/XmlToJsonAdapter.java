package com.patterns.structural.objectadapter;

import java.time.LocalDate;
import java.time.Period;

/**
 * Created by sridharrajagopal on 5/27/22.
 */
public class XmlToJsonAdapter implements XmlConvertable {
    private Service service;

    public XmlToJsonAdapter() {
        this.service = new Service();
    }

    @Override
    public void fetchDataFromLib(XmlClass xml) {
        JsonClass json = getJson(xml);
        service.callServerPerfomOperation(json);
    }

    public JsonClass getJson(XmlClass xml) {
        JsonClass jsonClass = new JsonClass();
        jsonClass.setEmployeeName(xml.getName());
        jsonClass.setPersonAge(Period.between(xml.getDateOfBirth(), LocalDate.now()).getYears());
        jsonClass.setSalary(xml.getSalary());
        if(xml.getSalary() > 300000) {
            jsonClass.setTax(xml.getSalary() * .05);
        } else if(xml.getSalary() > 300000 && xml.getSalary() < 1000000) {
            jsonClass.setTax(xml.getSalary() * .1);
        }  else if(xml.getSalary() > 1000000 && xml.getSalary() < 2000000) {
            jsonClass.setTax(xml.getSalary() * .2);
        } else if( xml.getSalary() > 2000000) {
            jsonClass.setTax(xml.getSalary() * .3);
        }
        return jsonClass;
    }
}
