package javastapls.demo;

import javastapls.business.custom_exceptions.CustomNotFoundException;
import javastapls.data.entities.AcademicDirectorate;
import javastapls.data.entities.Course;
import javastapls.data.dtos.CourseDTO;
import javastapls.data.keys.CourseKey;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


@SpringBootTest
@AutoConfigureMockMvc
class DemoApplicationTests {
    @Autowired
    private MockMvc mockMvc;  

    @Test 
    void checkCustomException(){
        CustomNotFoundException customNotFoundException = new CustomNotFoundException("NotFoundException");
        assertNotNull(customNotFoundException);
    }

    @Test
    void checkControllerCourse() throws Exception{
        this.mockMvc.perform(get("/course/all/2021-2")
                    .contentType("application/json"))
                    .andExpect(status().isOk());
    }

    @Test
    void checkControllerAcademicDirectorate() throws Exception{
        this.mockMvc.perform(get("/academic-directorate/all")
                    .contentType("application/json"))
                    .andExpect(status().isOk());
    }

    @Test
    void checkEntityCourse() throws Exception{
        AcademicDirectorate academicDirectorate = new AcademicDirectorate("DC","Departamento de Ciencias");
        Course course1 = new Course();
        Course course2 = new Course("EG0005","2021-2","Matematicas 2",278,academicDirectorate);
        course1.setAcademicDirectorate(academicDirectorate);
        course1.setCode("EG0005");
        course1.setName("Matematicas 2");
        course1.setProjection(278);
        course1.setProjectionPeriod("2021-2");
        assertEquals(course1.getAcademicDirectorate(), course2.getAcademicDirectorate());
        assertEquals(course1.getCode(), course2.getCode());
        assertEquals(course1.getName(), course2.getName());
        assertEquals(course1.getProjection(), course2.getProjection());
        assertEquals(course1.getProjectionPeriod(), course2.getProjectionPeriod());
    }

    @Test
    void checkEntityCourseDTO() throws Exception{
        AcademicDirectorate academicDirectorate = new AcademicDirectorate("DC","Departamento de Ciencias");
        CourseDTO courseDto1 = new CourseDTO();
        CourseDTO courseDto2 = new CourseDTO("EG0005","Matematicas 2","2021-2",278,academicDirectorate.getName());
        courseDto1.setDtoAcademicDirectorateName(academicDirectorate.getName());
        courseDto1.setDtoCode("EG0005");
        courseDto1.setDtoName("Matematicas 2");
        courseDto1.setDtoProjection(278);
        courseDto1.setDtoProjectionPeriod("2021-2");
        assertEquals(courseDto1.getDtoAcademicDirectorateName(), courseDto2.getDtoAcademicDirectorateName());
        assertEquals(courseDto1.getDtoCode(), courseDto2.getDtoCode());
        assertEquals(courseDto1.getDtoName(), courseDto2.getDtoName());
        assertEquals(courseDto1.getDtoProjection(), courseDto2.getDtoProjection());
        assertEquals(courseDto1.getDtoProjectionPeriod(), courseDto2.getDtoProjectionPeriod());
    }

    @Test
    void checkEntityAcademicDirectorate() throws Exception{
        AcademicDirectorate academicDirectorate = new AcademicDirectorate("DH","Departamento de Humanidades");
        AcademicDirectorate academicDirectorate2 = new AcademicDirectorate();
        academicDirectorate2.setId("DH");
        academicDirectorate2.setName("Departamento de Humanidades");
        assertEquals(academicDirectorate.getId(),academicDirectorate2.getId());
        assertEquals(academicDirectorate.getName(), academicDirectorate2.getName());
    }

    @Test
    void checkDataCourseKey() throws Exception{
        CourseKey courseKey = new CourseKey();
        CourseKey courseKey2 = new CourseKey("DC","2021-2");
        CourseKey courseKey3 = new CourseKey("DH","2021-2");
        CourseKey courseKey4 = new CourseKey("DC","2021-1");
        CourseDTO course = new CourseDTO();
        courseKey.setCode("DC");
        courseKey.setProjectionPeriod("2021-2");
        assertEquals(courseKey.getCode(), courseKey2.getCode());
        assertEquals(courseKey.getProjectionPeriod(), courseKey2.getProjectionPeriod());
        assertEquals(true, courseKey.equals(courseKey2));
        assertEquals(false,courseKey.equals(null) );
        assertEquals(true, courseKey.equals(courseKey));
        assertEquals(false, courseKey.equals(course));
        assertEquals(false, courseKey.equals(courseKey3));
        assertEquals(false, courseKey2.equals(courseKey4));
        assertEquals(courseKey.hashCode(), courseKey2.hashCode());
    }

}
