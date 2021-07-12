package javastapls.controller;

import javastapls.business.CourseService;
import javastapls.data.dtos.CourseDTO;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/all/{period}")
    public List<CourseDTO> getCoursesByPeriod(@PathVariable(value = "period") String projectionPeriod){
        return courseService.getCoursesByPeriod(projectionPeriod);
    }
}
