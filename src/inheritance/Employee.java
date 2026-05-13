package inheritance;

public class Employee extends Person {

    int employeeId;
    String company;
    String role;
    double salary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", gender='" + gender + '\'' +
                ", employeeId=" + employeeId +
                ", company='" + company + '\'' +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                '}';
    }
}
