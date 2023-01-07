package oop.collections.exercises;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {
    public static int count(Map<Integer, Integer> map) {
        if (map.isEmpty()) return 0;
        return map.size();
    }

    public static void empty(Map<Integer, Integer> map) {
        map.clear();
    }

    public static boolean contains(Map<Integer, Integer> map, int key) {
        return map.containsKey(key);
    }

    public static boolean containsKeyValue(Map<Integer, Integer> map, int key, int value) {
        return map.containsKey(key) && map.get(key) == value;
    }

    public static Set<Integer> keySet(Map<Integer, Integer> map) {
        if (map == null) return null;
        return map.keySet();
    }

    public static Collection<Integer> values(Map<Integer, Integer> map) {
        if (map == null) return null;
        return map.values();
    }

    public static String getColor(int value) {
        Map<Integer, String> map = new HashMap<>(Map.ofEntries(Map.entry(0, "Black"), Map.entry(1, "White"), Map.entry(2, "red")));
        if (value >= 0 && value <=2){
            //Map entry = map.entrySet();
            return map.get(value);
        }
        return null;
    }
}
