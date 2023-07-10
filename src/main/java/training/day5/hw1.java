package training.day5;

import java.util.*;

public class hw1 {
    public static void printInformation(List<Person> dataStructure) {
        for (Person person : dataStructure) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                System.out.println("Teacher: " + teacher.getName());
                System.out.println("ID: " + teacher.getID());
                System.out.println("Subjects: " + teacher.getSubjects());
                System.out.println("School: " + teacher.getSchool());
                System.out.println("Salary: " + teacher.getSalary());
            } else if (person instanceof Student) {
                Student student = (Student) person;
                System.out.println("Student: " + student.getName());
                System.out.println("ID: " + student.getID());
                System.out.println("Class: " + student.getClass_());
                System.out.println("Number in Class: " + student.getNumberInClass());
                System.out.println("Grades: " + student.getGrade());
            }
            System.out.println();
        }
    }

    public static Student getStudentWithHighestGrade(List<Person> dataStructure, String subject) {
        double highestGrade = 0.0;
        Student studentWithHighestGrade = null;
        for (Person person : dataStructure) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (student.getGrade().containsKey(subject)) {
                    double grade = student.getGrade().get(subject);
                    if (grade > highestGrade) {
                        highestGrade = grade;
                        studentWithHighestGrade = student;
                    }
                }
            }
        }
        return studentWithHighestGrade;
    }

    public static Student getStudentWithLowestGrade(List<Person> dataStructure, String subject) {
        double lowestGrade = 6.00;
        Student studentWithLowestGrade = null;
        for (Person person : dataStructure) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (student.getGrade().containsKey(subject)) {
                    double grade = student.getGrade().get(subject);
                    if (grade < lowestGrade) {
                        lowestGrade = grade;
                        studentWithLowestGrade = student;
                    }
                }
            }
        }
        return studentWithLowestGrade;
    }

    public static double getAverageSalary(List<Person> dataStructure) {
        double totalSalary = 0.0;
        int teacherCount = 0;
        for (Person person : dataStructure) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                totalSalary += teacher.getSalary();
                teacherCount++;
            }
        }
        if (teacherCount > 0) {
            return totalSalary / teacherCount;
        } else {
            return 0.0;
        }
    }

    public static double getAverageGradeOfStudent(Student student) {
        double totalGrades = 0.0;
        int totalSubjects = student.getGrade().size();
        for (double grade : student.getGrade().values()) {
            totalGrades += grade;
        }
        if (totalSubjects > 0) {
            return totalGrades / totalSubjects;
        } else {
            return 0.0;
        }
    }

    public static double getAverageGradeOfClass(List<Person> dataStructure) {
        double totalGrades = 0.0;
        int studentCount = 0;
        for (Person person : dataStructure) {
            if (person instanceof Student) {
                Student student = (Student) person;
                totalGrades += getAverageGradeOfStudent(student);
                studentCount++;
            }
        }
        if (studentCount > 0) {
            return totalGrades / studentCount;
        } else {
            return 0.0;
        }
    }

    public static String getSubjectWithHighestGrade(Student student) {
        double highestGrade = 0.0;
        String subjectWithHighestGrade = null;
        for (Map.Entry<String, Double> entry : student.getGrade().entrySet()) {
            String subject = entry.getKey();
            double grade = entry.getValue();
            if (grade > highestGrade) {
                highestGrade = grade;
                subjectWithHighestGrade = subject;
            }
        }
        return subjectWithHighestGrade;
    }

    public static Teacher getTeacherWithHighestGrades(List<Person> dataStructure) {
        Map<Teacher, Double> teacherGrades = new HashMap<>();
        for (Person person : dataStructure) {
            if (person instanceof Teacher) {
                teacherGrades.put((Teacher) person, 0.0);
            }
        }
        for (Person person : dataStructure) {
            if (person instanceof Student) {
                Student student = (Student) person;
                for (Map.Entry<Teacher, Double> entry : teacherGrades.entrySet()) {
                    Teacher teacher = entry.getKey();
                    double totalGrade = entry.getValue() + student.getGrade().values().stream().mapToDouble(Double::doubleValue).sum();
                    teacherGrades.put(teacher, totalGrade);
                }
            }
        }
        double highestGrade = 0.0;
        Teacher teacherWithHighestGrades = null;
        for (Map.Entry<Teacher, Double> entry : teacherGrades.entrySet()) {
            Teacher teacher = entry.getKey();
            double grade = entry.getValue();
            if (grade > highestGrade) {
                highestGrade = grade;
                teacherWithHighestGrades = teacher;
            }
        }
        return teacherWithHighestGrades;
    }

    public static void main(String[] args) {
        List<Person> dataStructure = new ArrayList<>();

        Student student1 = new Student("Kamen", "Male", "123456", "10B", 1);
        student1.setGrade("Math", 5.50);
        student1.setGrade("Physics", 4.75);
        student1.setGrade("Himiq", 6.00);

        Student student2 = new Student("Preslava", "Female", "654321", "10A", 2);
        student2.setGrade("Math", 6.00);
        student2.setGrade("Physics", 5.25);
        student2.setGrade("Himiq", 5.50);

        Teacher teacher1 = new Teacher("Bodurkata", "Male", "987654", "PGEE", Arrays.asList("Math", "Physics"), 1700.00);
        Teacher teacher2 = new Teacher("Prodanova", "Female", "456789", "PGEE", Arrays.asList("Himiq"), 2000.00);

        dataStructure.add(student1);
        dataStructure.add(student2);
        dataStructure.add(teacher1);
        dataStructure.add(teacher2);

        printInformation(dataStructure);

        Student highestGradeStudent = getStudentWithHighestGrade(dataStructure, "Math");
        System.out.println("Student with the highest grade in Math: " + highestGradeStudent.getName());

        Student lowestGradeStudent = getStudentWithLowestGrade(dataStructure, "Physics");
        System.out.println("Student with the lowest grade in Physics: " + lowestGradeStudent.getName());

        double averageSalary = getAverageSalary(dataStructure);
        System.out.println("Average Salary: " + averageSalary);

        double averageGradeStudent1 = getAverageGradeOfStudent(student1);
        System.out.println("Average Grade of " + student1.getName() + ": " + (float)averageGradeStudent1);

        double averageGradeClass = getAverageGradeOfClass(dataStructure);
        System.out.println("Average Grade of the Class: " + averageGradeClass);

        String subjectHighestGradeStudent1 = getSubjectWithHighestGrade(student1);
        System.out.println("Subject with the highest grade for " + student1.getName() + ": " + subjectHighestGradeStudent1);

        Teacher teacherHighestGrades = getTeacherWithHighestGrades(dataStructure);
        System.out.println("Teacher with the highest grades: " + teacherHighestGrades.getName());
    }
}
