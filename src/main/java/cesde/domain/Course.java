package cesde.domain;

import java.util.Date;

public class Course {
    private int courseId;
    private String name;
    private int schoolId;
    private int teacherId;
    private Date startDate;
    private Date endDate;

    //constructor


    public Course() {
    }


    public Course(int courseId, String name,int teacherId, int schoolId, Date startDate, Date endDate) {
        this.courseId = courseId;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.teacherId = teacherId;
        this.schoolId = schoolId;
    }

    //getters and setters


    public int getCourseId() {return courseId;}

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

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}

