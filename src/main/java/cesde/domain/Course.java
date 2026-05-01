package cesde.domain;

import java.util.Date;

public class Course {
    private int courseId;
    private String name;
    private Date startDate;
    private Date endDate;

    //constructor
    public Course(int courseId, String name, Date startDate, Date endDate) {
        this.courseId = courseId;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    //getters and setters


    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    //name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}

