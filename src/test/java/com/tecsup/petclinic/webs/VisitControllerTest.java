package com.tecsup.petclinic.webs;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(VisitController.class)
@AutoConfigureMockMvc(addFilters = false)
class VisitControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testListVisits() throws Exception {
        mockMvc.perform(get("/visits"))
                .andExpect(status().isOk());
    }
}
