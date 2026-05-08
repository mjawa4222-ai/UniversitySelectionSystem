public class Field {

    private String fieldName;
    private String category;
    private String description;

    public Field(String fieldName, String category, String description) {
        this.fieldName = fieldName;
        this.category = category;
        this.description = description;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}