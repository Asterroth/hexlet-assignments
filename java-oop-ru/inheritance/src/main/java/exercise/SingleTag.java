package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {
    public SingleTag(String tagName, Map<String, String> tagAttributes) {
        super(tagName, tagAttributes);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("<" + this.getTagName() + " ");
        for (String key : this.getTagAttributes().keySet()) {
            result.append(key + "=\"");
            result.append(this.getTagAttributes().get(key) + "\" ");
        }
        result.replace(result.length() - 1, result.length(), ">");
        return result.toString();
    }
}
// END
