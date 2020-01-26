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

    public static void printID(Student student){
        System.out.println(student.getStudentID());
    }

    public static void main(String[] args) {
        Student student1 = new Student("M", "Champions", 555);


        printID(student1);
    }

}

