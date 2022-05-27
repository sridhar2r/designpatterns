package com.patterns.behavioral.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sridharrajagopal on 5/27/22.
 */
public class PasswordStrengthHandler extends BaseHandler {
    private List<String> restrictedPasswords = new ArrayList<String>() {
        {
            add("Password@123");
            add("Abc@12345");
            add("FirstName");
        }
    };
    @Override
    public boolean doHandle(String email, String password) {
        if(restrictedPasswords.contains(password)) {
            System.out.println("Password is not matching strength criteria");
            return false;
        }
        if(next != null) {
            return next.doHandle(email, password);
        }
        return true;
    }
}
