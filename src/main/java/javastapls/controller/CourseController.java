package javastapls.controller;

import javastapls.business.CourseService;
import javastapls.data.dtos.CourseDTO;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.logging.Logger;
@RestController
@RequestMapping("/course")
public class CourseController {

    static final Logger logger = Logger.getLogger(CourseController.class.getName());

    @Autowired
    private CourseService courseService;

    @GetMapping("/all/{period}")
    public List<CourseDTO> getCoursesByPeriod(@PathVariable(value = "period") String projectionPeriod){
        logger.info("Solicitando todas las proyecciones");
        return courseService.getCoursesByPeriod(projectionPeriod);
    }
}
