import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private String lastname;
    private int age;
    private double avgScore;

    public Student(String name, String lastname, int age, double avgScore) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.avgScore = avgScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", avgScore=" + avgScore +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Double.compare(student.avgScore, avgScore) == 0 &&
                Objects.equals(name, student.name) &&
                Objects.equals(lastname, student.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, age, avgScore);
    }

    //this, o
    @Override
    public int compareTo(Student o) {
        int res = name.compareTo(o.name);
        if (res == 0) {
            res = lastname.compareTo(o.lastname);
            if (res == 0) {
                res = Integer.compare(age, o.age);
                if (res == 0) {
                    res = Double.compare(avgScore, o.avgScore);
                }
            }
        }

        return res;
    }
}
