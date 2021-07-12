package javastapls.data.entities;

import javastapls.data.keys.CourseKey;
import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "courses")
public class Course implements Serializable {

    @EmbeddedId
    private CourseKey courseKey;

    @Column(name="name")
    private String name;

    @Column(name="projection")
    private int projection;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_academic_directorate", referencedColumnName = "id")
    @JsonBackReference
    private AcademicDirectorate academicDirectorate;

    Course(){
        //DEFAULT CONSTRUCTOR
    }

    Course(CourseKey courseKey, String name, AcademicDirectorate academicDirectorate, int projection) {
        this.courseKey = courseKey;
        this.name = name;
        this.academicDirectorate = academicDirectorate;
        this.projection = projection;
    }

    public CourseKey getCourseKey() {
        return this.courseKey;
    }

    public void setCourseKey(CourseKey courseKey) {
        this.courseKey = courseKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AcademicDirectorate getAcademicDirectorate() {
        return this.academicDirectorate;
    }

    public void setAcademicDirectorate(AcademicDirectorate academicDirectorate) {
        this.academicDirectorate = academicDirectorate;
    }

    public int getProjection() {
        return projection;
    }

    public void setProjection(int projection) {
        this.projection = projection;
    }
}
