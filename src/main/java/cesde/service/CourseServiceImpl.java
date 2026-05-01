package cesde.service;

import cesde.domain.Course;
import cesde.persistence.repository.CourseRepository;
import cesde.service.portInput.CourseService;

import java.util.ArrayList;

public class CourseServiceImpl implements CourseService {
    private CourseRepository repo = new CourseRepository();

    @Override
    public Course createCourse(Course course) {
        return repo.createCourseRepository(course);
    }

    @Override
    public Course getCourseById(int id) {
        return repo.getCourseByIdRepository(id);
    }

    @Override
    public ArrayList<Course> getAllCourses() {
        return repo.getAllCourses();
    }

    @Override
    public Course updateCourse(Course course) {
        return repo.updateCourseRepository(course);
    }

    @Override
    public void deleteCourse(int id) {
        repo.deleteCourseRepository(id);
    }
}
