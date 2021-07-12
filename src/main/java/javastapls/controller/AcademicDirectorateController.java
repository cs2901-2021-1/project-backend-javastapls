package javastapls.controller;

import javastapls.business.AcademicDirectorateService;
import javastapls.data.entities.AcademicDirectorate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/academic-directorate")
public class AcademicDirectorateController {
    @Autowired
    private AcademicDirectorateService academicDirectorateService;

    @GetMapping("/all")
    public List<AcademicDirectorate> getAllAcademicDirectorates(){
        return academicDirectorateService.getAllAcademicDirectorates();
    }
    
}
