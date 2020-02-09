import java.util.Objects;

public class Student {
    private String name;
    private String vorname;
    private double avgScore;

    public Student(String name, String vorname, double avgScore) {
        this.name = name;
        this.vorname = vorname;
        this.avgScore = avgScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", vorname='" + vorname + '\'' +
                ", avgScore=" + avgScore +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.avgScore, avgScore) == 0 &&
                Objects.equals(name, student.name) &&
                Objects.equals(vorname, student.vorname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, vorname, avgScore);
    }
}
