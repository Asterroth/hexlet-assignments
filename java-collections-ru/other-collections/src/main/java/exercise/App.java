package exercise;

import java.util.*;

// BEGIN
class App {

    public static void main(String[] args) {
        Map<String, Object> data1 = new HashMap<>(
                Map.of("one", "eon", "two", "two", "four", true)
        );
        System.out.println(data1); //=> {two=two, four=true, one=eon}

        Map<String, Object> data2 = new HashMap<>(
                Map.of("two", "own", "zero", 4, "four", true)
        );
        System.out.println(data2); //=> {zero=4, two=own, four=true}

        Map<String, String> result = App.genDiff(data1, data2);
        System.out.println(result); //=> {four=unchanged, one=deleted, two=changed, zero=added}
    }
    public static LinkedHashMap<String, String> genDiff (Map<String, Object> data1, Map<String, Object> data2) {
        LinkedHashMap<String, String> result = new LinkedHashMap<>();
        var keys1 = data1.keySet();
        var keys2 = data2.keySet();

        // "added" — ключ отсутствовал в первом массиве, но был добавлен во второй = keys2 - keys1
        Set<String> added = new HashSet<>(keys2);
        added.removeAll(keys1);
        for (String key : added) {
            result.put(key, "added");
        }

        // "deleted" — ключ был в первом массиве, но отсутствует во втором = keys1 - keys2
        Set<String> deleted = new HashSet<>(keys1);
        deleted.removeAll(keys2);
        for (String key : deleted) {
            result.put(key, "deleted");
        }

        // "changed" — ключ присутствовал и в первом и во втором массиве, но значения отличаются
        // "unchanged" — ключ присутствовал и в первом и во втором массиве с одинаковыми значениями
        Set<String> changed = new HashSet<>();
        changed.addAll(keys1);
        changed.retainAll(keys2);
        for (String key : changed) {
            if (data2.get(key).equals(data1.get(key))) {
                result.put(key, "unchanged");
            } else {
                result.put(key, "changed");
            }
        }

        return result;
    }

}
//END
