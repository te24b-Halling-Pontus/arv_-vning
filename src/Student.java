public class Student extends SchoolPerson {
    private int grade;
    private String specialization;

    public Student(String name, int age, String schoolName, int grade, String specialization) {
        super(name, age, schoolName);
        if (grade < 1) {
            throw new IllegalArgumentException("Årskursen måste vara större än 0");
        }
        this.grade = grade;
        this.specialization = specialization;
    }

    public int getGrade() {
        return grade;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void SetSpecialization(String specialization){
        this.specialization = specialization;       
    }
}