public class SchoolPerson{
    private final String name;
    private int age; 
    private String schoolName;
    public SchoolPerson(String namne, int age, String schoolName) {
        if (namne == null || namne.isBlank()) {
            throw new IllegalArgumentException("Namnet får inte vara tomt");
        }
        this.name = namne;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getName() {
        return name;
    }
}