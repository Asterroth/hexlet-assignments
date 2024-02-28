package exercise;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
class App {
    public static void main(String[] args) {
        KeyValueStorage storage = new InMemoryKV(Map.of("key", "value", "key2", "value2"));
        App.swapKeyValue(storage);
        storage.get("key", "default"); // "default"
        storage.get("value", "default"); // "key"

        System.out.println(storage.toMap()); // => {value=key, value2=key2}
    }

    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> data = storage.toMap();
        for (String key: data.keySet()) {
            storage.unset(key);
            storage.set(data.get(key), key);
        }
    }
}
// END
