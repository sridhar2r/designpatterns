package com.patterns.structural.decorator.stringeg;

/**
 * Created by sridharrajagopal on 5/27/22.
 */
public abstract class StringTransformDecorator implements StringTransformable {
    protected StringTransformable stringTransformer;
    public StringTransformDecorator(StringTransformable stringTransformer) {
        this.stringTransformer = stringTransformer;
    }
    @Override
    public String transform(String sentence) {
        return stringTransformer.transform(sentence);
    }
}
