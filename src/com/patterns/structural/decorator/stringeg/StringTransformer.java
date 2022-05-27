package com.patterns.structural.decorator.stringeg;

/**
 * Created by sridharrajagopal on 5/27/22.
 */
public class StringTransformer implements StringTransformable {
    @Override
    public String transform(String sentence) {
        System.out.println("Transforming "+ sentence);
        sentence += " Transformed";
        return sentence;
    }
}
