package javastapls.data.keys;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CourseKey implements Serializable{
    @Column(name = "code")
    String code;

    @Column(name = "projection_period")
    String projectionPeriod;

    public CourseKey(){

    }

    public CourseKey(String code, String projectionYear){
        this.code = code;
        this.projectionPeriod = projectionYear;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        var courseKey = (CourseKey) o;
        return (this.code.equals(courseKey.getCode()) && 
                this.projectionPeriod.equals(courseKey.getProjectionPeriod()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.code, this.projectionPeriod);
    }
    
}