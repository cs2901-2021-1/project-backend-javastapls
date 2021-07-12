package javastapls.data.entities;

import javax.persistence.*;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import java.util.ArrayList;



@Entity
@Table(name = "AcademicDirectorates")
public class AcademicDirectorate implements Serializable {
    @Id
    @Column(name="id")
    private String id;

    @Column(name="name")
    private String name;

    @OneToMany(
			mappedBy = "academicDirectorate",
			cascade = CascadeType.ALL,
			fetch = FetchType.LAZY,
			orphanRemoval = true
	)
	@JsonIgnore
	private final List<Course> courses = new ArrayList<>();

    public AcademicDirectorate(){
        //DEFAULT CONSTRUCTOR
    }

    public AcademicDirectorate(String id, String name){
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
