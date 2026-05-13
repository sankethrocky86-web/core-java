package inheritance;

public class Student extends Person {

    String course;
    int sem;
    String college;
    double cgpa;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", gender='" + gender + '\'' +
                ", course='" + course + '\'' +
                ", sem=" + sem +
                ", college='" + college + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}