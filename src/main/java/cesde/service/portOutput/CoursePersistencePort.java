package cesde.service.portOutput;

import cesde.domain.Course;

import java.util.ArrayList;

public interface CoursePersistencePort {
    public Course createCourseRepository(Course course);
    public Course getCourseByIdRepository(int id);
    public ArrayList<Course> getAllCourses();
    public Course updateCourseRepository(Course course);
    public void deleteCourseRepository(int id);
}
