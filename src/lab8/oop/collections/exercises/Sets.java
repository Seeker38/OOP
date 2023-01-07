package oop.collections.exercises;

import java.util.*;

public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        if (first == null || second == null) {
            return null;
        }
        Set<Integer> newSet = new HashSet<>();
        for (int i : first) {
            for (int j : second) {
                if (i == j) {
                    newSet.add(i);
                }
            }
        }
        return newSet;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        if (first == null || second == null) {
            return null;
        }
        Set<Integer> newSet = new HashSet<>();
        for (int i : first) {
            newSet.add(i);
        }
        for (int j : second) {
            newSet.add(j);
        }
        return newSet;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        if (first == null || second == null) {
            return null;
        }
        Set<Integer> newSet = new HashSet<>(first);
        newSet.retainAll(second);
        return newSet;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        if (first == null || second == null) {
            return null;
        }
        Set<Integer> newSet = new HashSet<>(first);
        newSet.addAll(second);
        return newSet;
    }

    public static List<Integer> toList(Set<Integer> source) {
        if (source == null) {
            return null;
        }
        return new ArrayList<>(source);
    }

    public static List<Integer> revmoveDuplicates(List<Integer> source) {
        if (source == null) {
            return null;
        }
        return new ArrayList<>(new HashSet<>(source));
    }

    public static List<Integer> revmoveDuplicatesManual(List<Integer> source) {
        if (source == null) {
            return null;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i : source) {
            if (!ans.contains(i)) {
                ans.add(i);
            }
        }
        return ans;
    }

    public static String firstRecurringCharacter(String s) {
        if (s.length() == 0 || s == null) {
            return null;
        }
        Set<String> ans = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            String str = s.charAt(i) + "";
            if (ans.contains(str)) {
                return str;
            }
            ans.add(str);
        }
        return null;
    }

    public static Set<Character> allRecurringChars(String s) {
        if (s.length() == 0 || s == null) {
            return null;
        }

        Set<Character> set = new HashSet<>();
        Set<Character> ans = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (set.contains(letter)) {
                ans.add(letter);
            } else {
                set.add(letter);
            }
        }
        return ans;
    }

    public static Integer[] toArray(Set<Integer> source) {
        if (source == null) {
            return null;
        }
        return source.toArray(new Integer[0]);
    }

    public static int getFirst(TreeSet<Integer> source) {
        if (source == null) {
            return -99;
        }
        return source.first();
    }

    public static int getLast(TreeSet<Integer> source) {
        if (source == null) {
            return -99;
        }
        return source.last();
    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        if (source == null) {
            return -99;
        }
        if (Collections.max(source) <= value) {
            return -99;
        }
        return source.higher(value);
    }
}

