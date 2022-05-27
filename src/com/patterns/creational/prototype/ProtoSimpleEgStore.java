package com.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sridharrajagopal on 5/26/22.
 */
public class ProtoSimpleEgStore {
    private static Map<String, ProtoSimpleEg> map = new HashMap<>();
    static {
        ProtoSimpleEg protoSimpleEg = new ProtoSimpleEg();
        protoSimpleEg.setName("Sridhar");
        protoSimpleEg.setEmpId(131413);
        map.put("Sridhar", protoSimpleEg);
    }

    public ProtoSimpleEg getProtoObj(String name) {
        return (ProtoSimpleEg) map.get(name).clone();
    }
}
