package training.day5;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class Student extends Person{
    private String class_;
    private int numberInClass;
    private final Map<String, Double> grade = new HashMap<>();

    public Student(String name, String gender, String id, String class_, int numberInClass) {
        super(name, gender, id);
        this.class_ = class_;
        this.numberInClass = numberInClass;
    }
    public String getClass_(){
        return class_;
    }

    public void setClass(String class_){
        this.class_ = class_;
    }
    public int getNumberInClass(){
        return numberInClass;
    }
    public void setNumberInClass(int numInClass){
        if(numInClass < 1){
            throw new IllegalArgumentException("Wrong value!");
        }else{
            this.numberInClass = numInClass;
        }
    }
    public Map<String, Double> getGrade(){
        return grade;
    }

    public void setGrade(String subjectName, Double grade){
        this.grade.put(subjectName, grade);
    }
}
