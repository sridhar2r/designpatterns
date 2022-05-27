package com.patterns.behavioral.chainofresponsibility;

/**
 * Created by sridharrajagopal on 5/27/22.
 */
public class Demo {
    public static void main(String[] args) {
/*        LoginHandler loginHandler = new LoginHandler();
        PasswordStrengthHandler passwordStrengthHandler = new PasswordStrengthHandler();
        PasswordLengthHandler passwordLengthHandler = new PasswordLengthHandler();
        passwordLengthHandler.setNext(passwordStrengthHandler);
        passwordStrengthHandler.setNext(loginHandler);*/

        PasswordLengthHandler passwordLengthHandler = new PasswordLengthHandler();
        passwordLengthHandler.setNext(new PasswordStrengthHandler()).setNext(new LoginHandler());

        passwordLengthHandler.doHandle("sridhar2.r@gmail.com", "LongPassword@1234");
        passwordLengthHandler.doHandle("ssss.r@gmail.com", "abcd");
        passwordLengthHandler.doHandle("ssss.r@gmail.com", "Password@123");
        passwordLengthHandler.doHandle("ssss.r@gmail.com", "LongPassword@1234");
    }
}
