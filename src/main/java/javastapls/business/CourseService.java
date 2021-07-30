package javastapls.business;

import javastapls.data.dtos.CourseDTO;
import javastapls.data.entities.Course;

import javax.transaction.Transactional;

import javastapls.data.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

@Service
@Transactional
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<CourseDTO> getCoursesByPeriod(String projectionPeriod){
        List<Course> courses = courseRepository.getCoursesByPeriod(projectionPeriod);
        List<CourseDTO> coursesDTO = new ArrayList<>();
        for(Course course : courses){
            CourseDTO courseDTO = new CourseDTO(course.getCode(), course.getName(), 
                course.getProjectionPeriod(), course.getProjection(),course.getPrecision(), course.getAcademicDirectorate().getName());
            coursesDTO.add(courseDTO);
        }
        return coursesDTO;
    }
}
