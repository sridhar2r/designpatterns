package com.patterns.structural.objectadapter;

/**
 * Created by sridharrajagopal on 5/27/22.
 */
public class Service {
    public void callServerPerfomOperation(JsonClass json) {
        System.out.println("Calling server and performing operation with "+json.toString());

    }
}
