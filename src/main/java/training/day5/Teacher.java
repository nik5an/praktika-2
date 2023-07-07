package training.day5;

public class Teacher extends Person{
    private String school;
    private String[] subjects;
    private int salary;

    public Teacher(String name, String gender, String id, String school, String[] subjects, int salary) {
        super(name, gender, id);
        this.school = school;
        this.subjects = subjects;
        this.salary = salary;
    }
}
