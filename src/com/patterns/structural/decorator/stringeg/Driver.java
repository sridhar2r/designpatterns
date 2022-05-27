package com.patterns.structural.decorator.stringeg;

/**
 * Created by sridharrajagopal on 5/27/22.
 */
public class Driver {
    public static void main(String[] args) {
        String sentence = "  Initial sentence with spaces   ";
        StringTransformable stringTransformable = new StringTransformer();
        StringTransformable stringTrimTransformable = new StringTrimTransformDecorator(new StringTransformer());
        String transformWithoutDecorator = stringTransformable.transform(sentence);
        String transformWithDecorator = stringTrimTransformable.transform(sentence);

        System.out.println("-----Final Results -----");
        System.out.println("Original " + sentence);
        System.out.println("TransformWithoutDecorator " + transformWithoutDecorator);
        System.out.println("TransformWithDecorator " + transformWithDecorator);
    }
}
