package ru.sbt.lesson4_Generic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;



public class CollectionUtils {
    public static<T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }

    public static<T> List<T> newArrayList() {
        return new ArrayList<T>();
    }

    public static<T> int indexOf(List<? extends T> source, T t) {
        return source.indexOf(t);
    }

    public static<T> List<T> limit(List<? extends T> source, int size) {
        return new ArrayList<T>(source.subList(0, size));
    }

    public static<T> void add(List<? super T> source, T t) {
        source.add(t);
    }

    public static<T> void removeAll(List<? super T> removeFrom, List<? extends T> c2) {
        removeFrom.removeAll(c2);
    }

    public static<T> boolean containsAll(List<? super T> c1, List<? extends T> c2) {
        return c1.containsAll(c2);
    }

    public static<T> boolean containsAny(List<? super T> c1, List<? extends T> c2) {
        for (T item: c2) {
            return c1.contains(item);
        }
        return false;
    }

    public static<T extends Comparable<? super T>> List<T> range(List<? extends T> list, T min, T max) {
        List<T> subList = new LinkedList<>();
        for (T item : list) {
            if (Math.abs(item.compareTo(min)+item.compareTo(max)) < 2)
                subList.add(item);
        }
        return subList;
    }


    public static<T> List<? super T> range(List<? extends T> list, T min, T max, Comparator<T> comparator) {
        List<? super T> subList = new LinkedList<>();
        for (T item : list) {
            if (Math.abs(comparator.compare(item, min) + comparator.compare(item, max)) < 2)
                subList.add(item);

        }
        return subList;
    }
}
