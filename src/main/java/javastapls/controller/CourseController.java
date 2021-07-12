package javastapls.controller;

import javastapls.business.CourseService;
import javastapls.data.entities.Course;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.logging.Logger;
import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    static final Logger logger = Logger.getLogger(CourseController.class.getName());

    @GetMapping("/all/{period}")
    public List<Course> getCoursesByPeriod(@PathVariable(value = "Period") String projectionPeriod){
        return courseService.getCoursesByPeriod(projectionPeriod);
    }
}
