package com.patterns.behavioral.chainofresponsibility;

/**
 * Created by sridharrajagopal on 5/27/22.
 */
public class PasswordLengthHandler extends BaseHandler {
    @Override
    public boolean doHandle(String email, String password) {
        if(password.length() <= 8) {
            System.out.println("Password length is incorrect ");
            return false;
        }
        if(next != null) {
            return next.doHandle(email, password);
        }
        return true;
    }
}
