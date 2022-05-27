package com.patterns.behavioral.chainofresponsibility;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sridharrajagopal on 5/27/22.
 */
public class LoginHandler extends BaseHandler {
    private Map<String, String> userCredentials = new HashMap<String, String>() {
        {
            put("ssss.r@gmail.com", "LongPassword@1234");
            put("yyyy.g@gmail.com", "NewPassword@1234");
        }
    };
    @Override
    public boolean doHandle(String email, String password) {
        if(!(userCredentials.containsKey(email) && userCredentials.get(email).equals(password))) {
            System.out.println("User Authentication failed");
            return false;
        } else {
            System.out.println("User "+email+" authenticated successfully");
        }
        return true;
    }
}
