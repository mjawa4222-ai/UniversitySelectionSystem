public class Student {
    private String name;
    private String city;
    private float percentage;
    private double budget;
    private String field;
    private double entryTestScore;
    private String campusPreference;
    private String uniType;

    public Student(
            String Name,
            String City,
            float Percentage,
            double budget,
            String field,
            double entryTestScore,
            String campusPreference,
            String uniType) {
        this.name = name;
        this.city = city;
        this.percentage = percentage;
        this.budget = budget;
        this.field = field;
        this.entryTestScore = entryTestScore;
        this.campusPreference = campusPreference;
        this.uniType = uniType;
    }

    public String getname() {
        return name;
    }

    public String getcity() {
        return city;
    }

    public float getpercentage() {
        return percentage;
    }

    public double getBudget() {
        return budget;
    }

    public String getField() {
        return field;
    }

    public double getEntryTestScore() {
        return entryTestScore;
    }

    public String getUniType() {
        return uniType;
    }

    public String getCampusPreference() {
        return campusPreference;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void setField(String field) {
        this.field = field;
    }

    public void setEntryTestScore(double entryTestScore) {
        this.entryTestScore = entryTestScore;
    }

    public void setUniType(String uniType) {
        this.uniType = uniType;
    }

    public void setCampusPreference(String campusPreference) {
        this.campusPreference = campusPreference;
    }
}
