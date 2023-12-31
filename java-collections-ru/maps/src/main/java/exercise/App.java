package exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// BEGIN
class App {
    public static void main(String[] args) {
        System.out.println(toString(getWordCount("word text dog apple word apple word")));
    }
    public static Map<String, Integer> getWordCount(String str) {
        List<String> strArr = new ArrayList<>(List.of(str.split(" ")));
        Map<String, Integer> result = new HashMap<>();
        if (str.equals("")) {
            return result;
        }
        for (String s : strArr) {
            if (result.containsKey(s)) {
                int sum = result.get(s) + 1;
                result.put(s, sum);
            } else {
                result.put(s, 1);
            }
        }
        return result;
    }

    public static String toString(Map<String, Integer> map) {
        if (map.size() == 0) {
            return "{}";
        }
        String res = "{\n";
        for (String element : map.keySet()) {
            res += "  " + element + ": " + map.get(element) + "\n";
        }
        res += "}\n";
        return res;
    }
}
//END
