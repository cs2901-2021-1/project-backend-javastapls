package javastapls.data.entities;

import javastapls.data.keys.CourseKey;
import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "courses")
@IdClass(CourseKey.class)
public class Course implements Serializable {

    @Id
    @Column(name="code")
    String code;

    @Id
    @Column(name = "projection_period")
    String projectionPeriod;

    @Column(name="name")
    private String name;

    @Column(name="projection")
    private int projection;

    @Column(name="precision")
    private double precision;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_academic_directorate", referencedColumnName = "id")
    @JsonBackReference
    private AcademicDirectorate academicDirectorate;

    public Course(){
        //DEFAULT CONSTRUCTOR
    }

    public Course(String code, String projectionPeriod, String name, int projection,double precision, AcademicDirectorate academicDirectorate){
        this.code = code;
        this.projectionPeriod = projectionPeriod;
        this.name = name;
        this.projection = projection;
        this.precision = precision;
        this.academicDirectorate = academicDirectorate;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getProjectionPeriod() {
        return this.projectionPeriod;
    }

    public void setProjectionPeriod(String projectionPeriod) {
        this.projectionPeriod = projectionPeriod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProjection() {
        return projection;
    }

    public void setProjection(int projection) {
        this.projection = projection;
    }
    
    public double getPrecision() {
        return precision;
    }

    public void setPrecision(double precision) {
        this.precision = precision;
    }

    public AcademicDirectorate getAcademicDirectorate() {
        return this.academicDirectorate;
    }

    public void setAcademicDirectorate(AcademicDirectorate academicDirectorate) {
        this.academicDirectorate = academicDirectorate;
    }
}
