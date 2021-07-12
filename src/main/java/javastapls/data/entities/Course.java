package javastapls.data.entities;

import javax.persistence.Column;
import javax.persistence.Id;

public class Course {
    @Id
    @Column(name = "code")
    String code;

    @Column(name="name")
    String name;

    @Column(name="idAcademicDirectorate")
    String idAcademicDirectorate;

    @Column(name="projection")
    int projection;

    Course(){
        //DEFAULT CONSTRUCTOR
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdAcademicDirectorate() {
        return idAcademicDirectorate;
    }

    public void setIdAcademicDirectorate(String idAcademicDirectorate) {
        this.idAcademicDirectorate = idAcademicDirectorate;
    }

    public int getProjection() {
        return projection;
    }

    public void setProjection(int projection) {
        this.projection = projection;
    }
}
