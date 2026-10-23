public class Headmaster extends SchoolPerson {
    private int yearsOfExperience;

    public Headmaster(String name, int age, String schoolName, int yearsOfExperience) {
        super(name, age, schoolName);
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
}