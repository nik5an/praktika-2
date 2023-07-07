package training.day5;

public class Student extends Person{
    private String klasse;
    private int numberInClass;
    private double grade;

    public Student(String name, String gender, String id, String klasse, int numberInClass, double grade) {
        super(name, gender, id);
        this.klasse = klasse;
        this.numberInClass = numberInClass;
        this.grade = grade;
    }
}
