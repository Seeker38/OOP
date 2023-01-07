package oop.collections.exercises;

import java.util.*;


public class TestMap {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(3, 4);
        map.put(5, 6);
        System.out.println(map);
        System.out.println(Maps.count(map));
        Maps.empty(map);
        System.out.println(map);
        map.put(1, 2);
        map.put(3, 4);
        map.put(5, 6);
        System.out.println(Maps.contains(map, 1));
        System.out.println(Maps.contains(map, 4));
        System.out.println(Maps.containsKeyValue(map, 1, 2));
        System.out.println(Maps.containsKeyValue(map, 1, 3));
        System.out.println(Maps.keySet(map));
        System.out.println(Maps.values(map));
        System.out.println(Maps.getColor(0));
        System.out.println(Maps.getColor(-1));
    }
}
