package cesde.domain;

public class Teacher extends User {
    //Attributes
    private String speciality;

    //Constructors
    public Teacher(){
        super();
    }

    public Teacher(int id, String name, String lastName, String email, String phone, String password, boolean status, String speciality) {
        super(id, name, lastName, email, phone, password, status);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
