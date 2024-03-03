package exercise;

// BEGIN
class LabelTag implements TagInterface {
    String description;
    TagInterface tag;
    @Override
    public String render() {
        return "<label>" + description + tag.render() + "</label>";
    }

    public LabelTag(String description, TagInterface tag) {
        this.description = description;
        this.tag = tag;
    }
}
// END
