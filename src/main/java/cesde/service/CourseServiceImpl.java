package cesde.service;

import cesde.domain.Course;
import cesde.persistence.repository.CourseRepository;
import cesde.service.portInput.CourseService;
import cesde.util.TypeValidator;

import java.util.ArrayList;

public class CourseServiceImpl implements CourseService {
    private CourseRepository repo = new CourseRepository();

    @Override
    public Course createCourse(Course course) {
        Course newCourse = new Course();

        newCourse.setCourseId(TypeValidator.validateInt("Ingrese el id del curso"));
        newCourse.setName(TypeValidator.validateString("Ingrese el nombre del curso"));
        //newCourse.setSchoolId(TypeValidator.validateInt("Ingrese el id de la escuela");
        //newCourse.setTeacherId(TypeValidator.validateInt("Ingrese el id del profesor"));

        return repo.createCourseRepository(newCourse);
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
