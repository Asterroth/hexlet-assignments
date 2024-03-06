package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    public String tagBody;
    public List<Tag> children;

    public PairedTag(String tagName, Map<String, String> tagAttributes, String tagBody, List<Tag> children) {
        super(tagName, tagAttributes);
        this.tagBody = tagBody;
        this.children = children;
    }

    public String toString () {
        StringBuilder result = new StringBuilder("<" + this.getTagName() + " ");
        for (String key : this.getTagAttributes().keySet()) {
            result.append(key + "=\"");
            result.append(this.getTagAttributes().get(key) + "\" ");
        }
        result.replace(result.length() - 1, result.length(), ">");
        result.append(this.tagBody);
        for (Tag item : this.children) {
            StringBuilder tagString = new StringBuilder("<" + item.getTagName() + " ");
            for (String key : item.getTagAttributes().keySet()) {
                tagString.append(key + "=\"");
                tagString.append(item.getTagAttributes().get(key) + "\" ");
            }
            tagString.replace(tagString.length() - 1, tagString.length(), ">");
            result.append(tagString.toString());
        }
        result.append("<").append("/").append(this.getTagName()).append(">");
        return result.toString();
    }
}
// END
