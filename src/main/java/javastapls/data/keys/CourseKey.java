package javastapls.data.keys;

import java.io.Serializable;
import java.util.Objects;

public class CourseKey implements Serializable{

    String code;
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
        CourseKey courseKey = (CourseKey) o;
        return (this.code.equals(courseKey.getCode()) && 
                this.projectionPeriod.equals(courseKey.getProjectionPeriod()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.code, this.projectionPeriod);
    }
    
}