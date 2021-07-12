package javastapls.data.dtos;

public class CourseDTO {
    private String dtoCode;
    private String dtoName;
    private String dtoProjectionPeriod;
    private int dtoProjection;
    private String dtoAcademicDirectorateName;

    public CourseDTO(){

    }

    public CourseDTO(String dtoCode, String dtoName, String dtoProjectionPeriod, 
                        int dtoProjection, String dtoAcademicDirectorateName){
        this.dtoCode = dtoCode;
        this.dtoName = dtoName;
        this.dtoProjectionPeriod = dtoProjectionPeriod;
        this.dtoProjection = dtoProjection;
        this.dtoAcademicDirectorateName = dtoAcademicDirectorateName;
    }

    public String getDtoCode() {
        return this.dtoCode;
    }

    public void setDtoCode(String dtoCode) {
        this.dtoCode = dtoCode;
    }

    public String getDtoName() {
        return this.dtoName;
    }

    public void setDtoName(String dtoName) {
        this.dtoName = dtoName;
    }

    public String getDtoProjectionPeriod() {
        return this.dtoProjectionPeriod;
    }

    public void setDtoProjectionPeriod(String dtoProjectionPeriod) {
        this.dtoProjectionPeriod = dtoProjectionPeriod;
    }

    public int getDtoProjection() {
        return this.dtoProjection;
    }

    public void setDtoProjection(int dtoProjection) {
        this.dtoProjection = dtoProjection;
    }

    public String getDtoAcademicDirectorateName() {
        return this.dtoAcademicDirectorateName;
    }

    public void setDtoAcademicDirectorateName(String dtoAcademicDirectorateName) {
        this.dtoAcademicDirectorateName = dtoAcademicDirectorateName;
    }
}