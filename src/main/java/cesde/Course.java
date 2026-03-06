package cesde;

public class Course {
    private int id;
    private String name;

    public Course(int id, String name) {
        this.id = id;
        this.name = name;

    }

    //getters and setters
    //id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString() {
        return "Course{id=" + id + ", name='" + name + "'}";

    }
}
