package com.patterns.creational.prototype;

/**
 * Created by sridharrajagopal on 5/26/22.
 */
public class ProtoSimpleEgDriver {
    public static void main(String[] args) {
        ProtoSimpleEgStore protoSimpleEgStore = new ProtoSimpleEgStore();
        ProtoSimpleEg sridhar1 = protoSimpleEgStore.getProtoObj("Sridhar");
        ProtoSimpleEg sridhar2 = protoSimpleEgStore.getProtoObj("Sridhar");
        System.out.println(sridhar1.getEmpId() + " --- "+sridhar1.getName());
        System.out.println(sridhar2.getEmpId() + " --- "+sridhar2.getName());
        System.out.println("---------");
        System.out.println(sridhar1);
        System.out.println(sridhar2);
        System.out.println((sridhar1 == sridhar2));
    }
}
