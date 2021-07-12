package javastapls.controller;

import javastapls.business.AcademicDirectorateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/academic-directorate")
public class AcademicDirectorateController {
    @Autowired
    private AcademicDirectorateService academicDirectorateService;
}
