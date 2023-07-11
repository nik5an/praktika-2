package training.day5;

import java.util.List;

public class Teacher extends Person {
    private String school;
    private List<String> subjects;
    private double salary;

    public Teacher(String name, String gender, String id, String school, List<String> subjects, double salary) {
        super(name, gender, id);
        this.school = school;
        this.subjects = subjects;
        this.salary = salary;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubject(List<String> subject) {
        this.subjects = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printSubjects() {
        for (String subject : subjects) {
            System.out.println(subject);
        }
    }

    public String toString() {
        return "Teacher: " + getName() + " | ID: " + getID() + " | Subjects: " + getSubjects() + " | School: " + getSchool() +
                " | Salary: " + getSalary();
    }

}
