package exercise;

import java.util.Map;
import exercise.Utils;

// BEGIN
class FileKV implements KeyValueStorage {
    String path;
    private Map<String, String> map;

    public FileKV(String path, Map<String, String> map) {
        this.path = path;
        this.map = map;
    }

    @Override
    public void set(String key, String value) {

    }

    @Override
    public void unset(String key) {

    }

    @Override
    public String get(String key, String defaultValue) {
        return null;
    }

    @Override
    public Map<String, String> toMap() {
        return null;
    }
}
// END
