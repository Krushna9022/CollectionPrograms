package r33;

public class Student {
    private int Id;
    private String name;
    private int grade;

    public Student(int id, String name, int grade) {
        Id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}
