public class Student {
    private String name;
    private String vorname;
    private int age;
    private double avgScore;

    public Student(String name, String vorname, int age, double avgScore) {
        this.name = name;
        this.vorname = vorname;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
                ", age=" + age +
                ", avgScore=" + avgScore +
                '}';
    }
}
