public class Teacher extends SchoolPerson {
    private int yearsOfExperience;

    public Teacher(String name, int age, String schoolName, int yearsOfExperience){
        super(name, age, schoolName);
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
}
