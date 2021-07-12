package javastapls.data.entities;

import javax.persistence.Column;
import javax.persistence.Id;

public class AcademicDirectorate {
    @Id
    @Column(name="id")
    String id;

    @Column(name="name")
    String name;

    AcademicDirectorate(){
        //DEFAULT CONSTRUCTOR
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
