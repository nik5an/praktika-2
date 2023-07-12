package training.day5;

import java.util.HashMap;
import java.util.Map;

public class Student extends Person {
    private String classInSchool;
    private int numberInClass;
    private final Map<String, Double> grade = new HashMap<>();

    public Student(String name, String gender, String id, String class_, int numberInClass) {
        super(name, gender, id);
        this.classInSchool = class_;
        this.numberInClass = numberInClass;
    }

    public String getClassInSchool() {
        return classInSchool;
    }

    public void setClass(String class_) {
        this.classInSchool = class_;
    }

    public int getNumberInClass() {
        return numberInClass;
    }

    public void setNumberInClass(int numInClass) {
        if (numInClass < 1) {
            throw new IllegalArgumentException("Wrong value!");
        } else {
            this.numberInClass = numInClass;
        }
    }

    public Map<String, Double> getGrade() {
        return grade;
    }

    public void setGrade(String subjectName, Double grade) {
        this.grade.put(subjectName, grade);
    }

    public String toString() {
        return "Student: " + getName() + " | ID: " + getID() + " | Class: " + getClassInSchool() +
                " | Number in Class: " + getNumberInClass() + " | Grades: " + getGrade();
    }
}
