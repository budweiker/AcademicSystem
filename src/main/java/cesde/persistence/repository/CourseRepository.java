package cesde.persistence.repository;


import cesde.domain.Course;
import cesde.service.portInput.CourseService;
import cesde.service.portOutput.CoursePersistencePort;

import java.util.ArrayList;

public class CourseRepository implements CoursePersistencePort {
    ArrayList<Course> courses = new ArrayList<>();

    public Course createCourseRepository(Course course) {
        courses.add(course);
        return course;
    }

    public Course getCourseByIdRepository(int id) {
        for (Course c : courses) {
            if (c.getCourseId() == id) return c;
        }
        return null;
    }

    public ArrayList<Course> getAllCourses() {
        return courses;
    }

    public Course updateCourseRepository(Course course) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseId() == course.getCourseId()) {
                courses.set(i, course);
                return course;
            }
        }
        return null;
    }

    public void deleteCourseRepository(int id) {

        courses.removeIf(c -> c.getCourseId() == id);
    }
}
