package com.patterns.behavioral.chainofresponsibility;

/**
 * Created by sridharrajagopal on 5/27/22.
 */
public abstract class BaseHandler implements Handler  {
    protected Handler next;
    @Override
    public Handler setNext(Handler handler) {
        this.next = handler;
        return this.next;
    }
    @Override
    public boolean doHandle(String email, String password) {
        if(next != null) {
            return next.doHandle(email, password);
        }
        return true;
    }

}
