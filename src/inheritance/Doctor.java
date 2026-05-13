package inheritance;

public class Doctor extends Person {

    String hospital;
    String specialization;
    int experience;
    double fees;

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", gender='" + gender + '\'' +
                ", hospital='" + hospital + '\'' +
                ", specialization='" + specialization + '\'' +
                ", experience=" + experience +
                ", fees=" + fees +
                '}';
    }
}
