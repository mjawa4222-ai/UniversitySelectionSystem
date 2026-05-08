import java.util.ArrayList;

public class University {
    private String name;
    private String city;
    private String type;
    private int ranking;
    private float minPercentage;
    private double semesterFee;
    private boolean entryTestRequired;
    private double minEntryTestScore;
    private ArrayList<String> fields;

    public University(String name,
                      String city,
                      String type,
                      int ranking,
                      float minPercentage,
                      double semesterFee,
                      boolean entryTestRequired,
                      double minEntryTestScore,
                      ArrayList<String> fields) {
        this.name = name;
        this.city = city;
        this.type = type;
        this.ranking = ranking;
        this.minPercentage = minPercentage;
        this.semesterFee = semesterFee;
        this.entryTestRequired = entryTestRequired;
        this.minEntryTestScore = minEntryTestScore;
        this.fields = fields;
    }
    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getType() {
        return type;
    }

    public int getRanking() {
        return ranking;
    }

    public float getMinPercentage() {
        return minPercentage;
    }

    public double getSemesterFee() {
        return semesterFee;
    }

    public boolean isEntryTestRequired() {
        return entryTestRequired;
    }

    public double getMinEntryTestScore() {
        return minEntryTestScore;
    }

    public ArrayList<String> getFields() {
        return fields;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public void setMinPercentage(float minPercentage) {
        this.minPercentage = minPercentage;
    }

    public void setSemesterFee(double semesterFee) {
        this.semesterFee = semesterFee;
    }

    public void setEntryTestRequired(boolean entryTestRequired) {
        this.entryTestRequired = entryTestRequired;
    }

    public void setMinEntryTestScore(double minEntryTestScore) {
        this.minEntryTestScore = minEntryTestScore;
    }

    public void setFields(ArrayList<String> fields) {
        this.fields = fields;
    }
}
