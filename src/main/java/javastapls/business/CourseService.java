package javastapls.business;

import javax.transaction.Transactional;

import javastapls.data.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;
}
