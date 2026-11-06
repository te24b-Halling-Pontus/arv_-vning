import java.util.ArrayList;

public class Class {
    private String className;
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Teacher> teachers = new ArrayList<>();
    private String schedule;

    public Class(String className, String schedule) {
        this.className = className;
        this.schedule = schedule;
    }

    String getClassName() {
        return className;
    }

    public String getSchedule() {
        return schedule;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
}