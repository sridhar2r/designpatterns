package com.patterns.structural.decorator.stringeg;

/**
 * Created by sridharrajagopal on 5/27/22.
 */
public class StringTrimTransformDecorator extends StringTransformDecorator {
    public StringTrimTransformDecorator(StringTransformable stringTransformer) {
        super(stringTransformer);
    }

    @Override
    public String transform(String sentence) {
        sentence = sentence.trim();
        return stringTransformer.transform(sentence);
    }
}
