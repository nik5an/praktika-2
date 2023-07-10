package training.day5;

public class Person {
    private String name;
    private String gender;
    private String id;

    public Person(String name, String gender, String id) {
        this.name = name;
        this.gender = gender;
        this.id = id;
    }

    public Person() {
        this.name = "Gosho";
        this.gender = "Male";
        this.id = "69";
    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }
}

