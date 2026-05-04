package cesde.service;

import cesde.domain.Course;
import cesde.persistence.repository.CourseRepository;
import cesde.service.portInput.CourseService;
import cesde.util.TypeValidator;

import java.util.ArrayList;
import java.util.Optional;

public class CourseServiceImpl implements CourseService {
    private CourseRepository repo = new CourseRepository();

    @Override
    public Course createCourse(Course course) {
        Course newCourse = new Course();

        newCourse.setCourseId(TypeValidator.validateInt("Ingrese el id del curso"));
        newCourse.setName(TypeValidator.validateString("Ingrese el nombre del curso"));
        newCourse.setSchoolId(TypeValidator.validateInt("Ingrese el id de la escuela"));
        newCourse.setTeacherId(TypeValidator.validateInt("Ingrese el id del profesor"));

        return repo.createCourseRepository(newCourse);
    }

    @Override
    public Course getCourseById(int id) {
        Course course = repo.getCourseByIdRepository(id);

        if(id==course.getCourseId()){
            System.out.println("Id: " + course.getCourseId());
            System.out.println("Course name: " +course.getName());
            System.out.println("Start date: " +course.getStartDate());
            System.out.println("End date: " +course.getEndDate());
        }else {
            System.out.println("Id no encontrado");
        }
        return course;
    }
    @Override
    public ArrayList<Course> getAllCourses() {
        return repo.getAllCourses();
    }

    @Override
    public Course updateCourse(Course course) {
        Course existing = repo.getCourseByIdRepository(TypeValidator.validateInt("Ingrese el id del curso a actualizar"));

        if (existing != null) {
            System.out.println("Seleccione el dato a actualizar \n"+
                    "1. Name \n"+
                    "2. School Id\n"+
                    "3. Teacher Id");
            int option = TypeValidator.validateInt("Opción: ");

            switch (option) {
                case 1: existing.setName(TypeValidator.validateString("Nuevo nombre"));
                break;
                case 2: existing.setSchoolId(TypeValidator.validateInt("Nuevo School Id"));
                break;
                case 3: existing.setTeacherId(TypeValidator.validateInt("Nuevo Teacher Id"));
            }
            return repo.updateCourseRepository(existing);
        }
        return null;
    }

    @Override
    public void deleteCourse(int id) {
        repo.deleteCourseRepository(id);
    }
}
