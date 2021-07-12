package javastapls.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class ProjectBackendApplicationTests {
    @Autowired
    private MockMvc mockMvc;

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
}
