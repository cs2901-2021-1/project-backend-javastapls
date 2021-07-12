package javastapls.business;

import javastapls.data.entities.AcademicDirectorate;
import javastapls.data.repositories.AcademicDirectorateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AcademicDirectorateService {
    @Autowired
    private AcademicDirectorateRepository academicDirectorateRepository;

    public List<AcademicDirectorate> getAllAcademicDirectorates(){
        return academicDirectorateRepository.findAll();
    }
}
