package cesde.service.portInput;

import cesde.domain.Course;

import java.util.ArrayList;

public interface CourseService {
    public Course createCourse(Course course);
    public Course getCourseById(int id);
    public ArrayList<Course> getAllCourses();
    public Course updateCourse(Course course);
    public void deleteCourse(int id);
}
