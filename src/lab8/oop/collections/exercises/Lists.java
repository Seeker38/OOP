package oop.collections.exercises;

import java.util.*;

public class Lists {
    public static void insertFirst(ArrayList<Integer> list, int value) {
        list.add(0, value);
        if (list == null) {
            return;
        }
    }

    public static void insertLast(ArrayList<Integer> list, int value) {
        if (list == null) {
            return;
        }
        int last = list.size();
        list.add(last, value);
    }

    public static void replace(ArrayList<Integer> list, int value) {
        if (list.size() >= 3) {
            list.set(2, value);
        }
        if (list == null) {
            return;
        }
    }

    public static void removeThird(ArrayList<Integer> list) {
        if (list.size() >= 3) {
            list.remove(2);
        }
        if (list == null) {
            return;
        }
    }

    public static void removeEvil(ArrayList<Integer> list) {
        list.removeIf(i -> i == 666);
        if (list == null) {
            return;
        }
    }

    public static ArrayList<Integer> generateSquare() {
        ArrayList<Integer> newList = new ArrayList<>();
        int num = 0;
        for (int i = 1; i <= 1000; i++) {
            num = i * i;
            newList.add(num);
            if (newList.size() == 10) {
                break;
            }
        }
        return newList;
    }

    public static boolean contains(ArrayList<Integer> list, int value) {
        if (list == null) {
            return false;
        }
        boolean temp = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == value) {
                temp = true;
                break;
            }
        }
        return temp;
    }

    public static void copy(ArrayList<Integer> list, ArrayList<Integer> target) {
        target.clear();
        for (int i = 0; i < list.size(); i++) {
            target.add(list.get(i));
        }
    }

    public static void reverse(ArrayList<Integer> list) {
        if (list == null) {
            return;
        }
        Collections.reverse(list);
    }

    public static void reverseManual(ArrayList<Integer> list) {
        if (list == null) {
            return;
        }
        int size = 0;
        if (list.size() % 2 == 0) {
            size = list.size() / 2;
        } else {
            size = list.size() / 2 + 1;
        }

        int temp;
        for (int i = 0; i < size; i++) {
            temp = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, temp);
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        if (list == null) {
            return;
        }
        list.addFirst(value);
        list.addLast(value);
    }

}
