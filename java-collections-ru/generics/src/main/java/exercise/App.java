package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

// BEGIN
class App {

    public static List<Map<String, String>> findWhere (
            List<Map<String, String>> listToSearch,
            Map<String, String> targetMap) {

        List<Map<String, String>> result = new ArrayList<>();
        for (Map<String, String> book : listToSearch) {
            if (book.entrySet().containsAll(targetMap.entrySet())) {
                result.add(book);
            }
        }
        return result;
    }

}
//END
