package javastapls.business;

import javastapls.data.entities.Course;

import javax.transaction.Transactional;

import javastapls.data.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Transactional
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getCoursesByPeriod(String projectionPeriod){
        return courseRepository.getCoursesByPeriod(projectionPeriod);
    }
}
