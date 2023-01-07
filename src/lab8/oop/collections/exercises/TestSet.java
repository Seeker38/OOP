package oop.collections.exercises;

import java.util.*;


public class TestSet {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(6, 2, 7, 8, 9));
        Set<Integer> set3 = new HashSet<>();
        set3 = Sets.intersectionManual(set1, set2);
        System.out.println(Arrays.toString(set3.toArray()));
        set3 = Sets.intersection(set1, set2);
        System.out.println(Arrays.toString(set3.toArray()));
        set3 = Sets.unionManual(set1, set2);
        System.out.println(Arrays.toString(set3.toArray()));
        set3 = Sets.union(set1, set2);
        System.out.println(Arrays.toString(set3.toArray()));

        List<Integer> set4 = Sets.toList(set1);
        System.out.println(Arrays.toString(set4.toArray()));

        List<Integer> set5 = new ArrayList<>(List.of(4, 14, 34, 2, 14));
        set4 = Sets.revmoveDuplicates(set5);
        System.out.println(Arrays.toString(set4.toArray()));
        set4 = Sets.revmoveDuplicatesManual(set5);
        System.out.println(Arrays.toString(set4.toArray()));

        System.out.println(Sets.firstRecurringCharacter("abaco"));
        System.out.println(Sets.allRecurringChars("mamma"));

        System.out.println(Arrays.toString(Sets.toArray(set1)));

        TreeSet<Integer> treeSet1 = new TreeSet<>(List.of(1, 2, 3));
        System.out.println(Sets.getFirst(treeSet1));
        System.out.println(Sets.getLast(treeSet1));
        System.out.println(Sets.getGreater(treeSet1, 2));

    }
}
