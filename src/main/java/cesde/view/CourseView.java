package cesde.view;

import cesde.domain.Course;
import cesde.service.CourseServiceImpl;

public class CourseView {
//Inyección de dependencias
    private final CourseServiceImpl courseServiceImpl;

    public CourseView(CourseServiceImpl courseServiceImpl){
        this.courseServiceImpl = courseServiceImpl;
    }

    public void createCourse() {
        courseServiceImpl.createCourse(new Course());
    }

    public void getCourseById (int id){
        courseServiceImpl.getCourseById(id);
    }
}
