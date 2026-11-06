import java.util.ArrayList;

public class school {
    private String schoolName;
    private String adress;
    private Headmaster headmaster;
    private ArrayList<Class> classes = new ArrayList<>();

    school(String schoolName, String adress, Headmaster headmaster) {
        this.schoolName = schoolName;
        this.adress = adress;
        this.headmaster = headmaster;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getAdress() {
        return adress;
    }

    public Headmaster getHeadmaster() {
        return headmaster;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setHeadmaster(Headmaster headmaster) {
        this.headmaster = headmaster;
    }
    
}