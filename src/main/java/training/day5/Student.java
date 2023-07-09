package training.day5;

import java.util.Dictionary;
import java.util.Map;

public class Student extends Person{
    private String class_;
    private int numberInClass;
    private Map<String, Double> grade;

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
}
