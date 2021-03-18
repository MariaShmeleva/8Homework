package com.company;

public class BoxUtil {
    public static <T> void copyFromBoxToBox(Box<T> src, Box<? super T> dest) {
        dest.put(src.get());
    }

    public static <T extends Fruit> void copyFreshFruitFromBoxToBox( Box<T> src, Box<Fruit> dest) {
        if (src.get().getFresh()) {
            dest.put(src.get());
        }
    }

    public static <T> void printElementFromTwoBoxes(Box<Box<T>> box) {
        Box<T> newBox = box.get();
        System.out.println(newBox.get().toString());
    }

    public static void printElementFromBoxes(Box<?> box) {
        Object innerObject = box.get();
        while (innerObject instanceof Box) {
            innerObject = ((Box<?>) innerObject).get();
        }
        System.out.println(innerObject.toString());
    }

}
