package oop.collections.exercises;

import java.util.*;


public class TestList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(4, 14, 34, 2));
        Lists.insertFirst(list1, 2);
        System.out.println(Arrays.toString(list1.toArray()));
        Lists.insertLast(list1, 1);
        System.out.println(Arrays.toString(list1.toArray()));
        Lists.replace(list1, 3);
        System.out.println(Arrays.toString(list1.toArray()));
        Lists.removeThird(list1);
        System.out.println(Arrays.toString(list1.toArray()));
        Lists.removeEvil(list1);
        System.out.println(Arrays.toString(list1.toArray()));
        list1.add(666);
        Lists.removeEvil(list1);
        System.out.println(Arrays.toString(list1.toArray()));

        ArrayList<Integer> list2 = Lists.generateSquare();

        System.out.println(Arrays.toString(list2.toArray()));
        Lists.contains(list1, 34);
        System.out.println(Lists.contains(list1, 34));
        Lists.copy(list1, list2);
        System.out.println(Arrays.toString(list2.toArray()));
        Lists.reverse(list2);
        System.out.println(Arrays.toString(list2.toArray()));
        Lists.reverse(list1);
        System.out.println(Arrays.toString(list1.toArray()));

        LinkedList<Integer> list3 = new LinkedList<>(List.of(1, 2, 3));
        Lists.insertBeginningEnd(list3, 3);
        System.out.println(Arrays.toString(list3.toArray()));
    }
}
