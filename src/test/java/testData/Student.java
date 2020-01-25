package testData;

public class Student {
    private String name;
    private String group;
    private int studentID;

    public Student(String name, String group, int studentID){
        this.name = name;
        this.group = group;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getStudentID() {
        return studentID;
    }

}

