package javastapls.data.repositories;

import javastapls.data.entities.Course;
import javastapls.data.keys.CourseKey;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface CourseRepository extends JpaRepository<Course, CourseKey> {

    @Query(value = "select * from courses where projection_period = ?1", nativeQuery = true)
    List<Course> getCoursesByPeriod(String projectionPeriod);
}
