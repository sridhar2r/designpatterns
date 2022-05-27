package com.patterns.behavioral.chainofresponsibility;

/**
 * Created by sridharrajagopal on 5/27/22.
 */
public interface Handler {
    Handler setNext(Handler handler);
    boolean doHandle(String email, String password);
}
