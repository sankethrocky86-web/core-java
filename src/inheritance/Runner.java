package inheritance;

public class Runner {

    public static void main(String[] args) {

        // Student Objects

        Student student1 = new Student();
        student1.setName("Rahul");
        student1.setAge(21);
        student1.setCity("Bangalore");
        student1.setGender("Male");
        student1.setCourse("Engineering");
        student1.setSem(8);
        student1.setCollege("JNNCE");
        student1.setCgpa(8.5);

        Student student2 = new Student();
        student2.setName("Sneha");
        student2.setAge(20);
        student2.setCity("Mysore");
        student2.setGender("Female");
        student2.setCourse("MBA");
        student2.setSem(4);
        student2.setCollege("PES");
        student2.setCgpa(9.1);

        Student student3 = new Student();
        student3.setName("Arjun");
        student3.setAge(22);
        student3.setCity("Hubli");
        student3.setGender("Male");
        student3.setCourse("BCA");
        student3.setSem(6);
        student3.setCollege("KLE");
        student3.setCgpa(8.0);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);


        // Employee Objects

        Employee employee1 = new Employee();
        employee1.setName("Kiran");
        employee1.setAge(30);
        employee1.setCity("Bangalore");
        employee1.setGender("Male");
        employee1.setEmployeeId(101);
        employee1.setCompany("Infosys");
        employee1.setRole("Developer");
        employee1.setSalary(50000);

        Employee employee2 = new Employee();
        employee2.setName("Divya");
        employee2.setAge(28);
        employee2.setCity("Mangalore");
        employee2.setGender("Female");
        employee2.setEmployeeId(102);
        employee2.setCompany("Wipro");
        employee2.setRole("Tester");
        employee2.setSalary(45000);

        Employee employee3 = new Employee();
        employee3.setName("Rakesh");
        employee3.setAge(35);
        employee3.setCity("Tumkur");
        employee3.setGender("Male");
        employee3.setEmployeeId(103);
        employee3.setCompany("TCS");
        employee3.setRole("Manager");
        employee3.setSalary(70000);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);


        // Doctor Objects

        Doctor doctor1 = new Doctor();
        doctor1.setName("Anil");
        doctor1.setAge(45);
        doctor1.setCity("Bangalore");
        doctor1.setGender("Male");
        doctor1.setHospital("Apollo");
        doctor1.setSpecialization("Cardiology");
        doctor1.setExperience(15);
        doctor1.setFees(800);

        Doctor doctor2 = new Doctor();
        doctor2.setName("Meera");
        doctor2.setAge(39);
        doctor2.setCity("Shivamogga");
        doctor2.setGender("Female");
        doctor2.setHospital("Nanjappa");
        doctor2.setSpecialization("Dermatology");
        doctor2.setExperience(10);
        doctor2.setFees(500);

        Doctor doctor3 = new Doctor();
        doctor3.setName("Ravi");
        doctor3.setAge(50);
        doctor3.setCity("Davanagere");
        doctor3.setGender("Male");
        doctor3.setHospital("City Hospital");
        doctor3.setSpecialization("Orthopedic");
        doctor3.setExperience(20);
        doctor3.setFees(1000);

        System.out.println(doctor1);
        System.out.println(doctor2);
        System.out.println(doctor3);
    }
}