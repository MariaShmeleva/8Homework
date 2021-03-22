package com.company;

public class BoxUtil {
    public static <T> void copyFromBoxToBox(final Box<T> src, final Box<? super T> dest) {
        dest.put(src.get());
    }

    public static <T extends Fruit> void copyFreshFruitFromBoxToBox(final Box<T> src, final Box<Fruit> dest) {
        if (src.get() != null) {
            if (src.get().getFresh()) {
                dest.put(src.get());
            }
        }

    }

    public static <T> void printElementFromTwoBoxes(final Box<Box<T>> box) {
        Box<T> newBox = box.get();
        System.out.println(newBox.get().toString());
    }

    public static void printElementFromBoxes(final Box<?> box) {
        Object innerObject = box.get();
        while (innerObject instanceof Box) {
            innerObject = ((Box<?>) innerObject).get();
        }
        System.out.println(innerObject.toString());
    }

}
