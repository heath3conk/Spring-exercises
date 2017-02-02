package com.allstate.endpoint;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@RunWith(SpringRunner.class)
@WebMvcTest(EndpointController.class)
public class EndpointControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testIndexEndpoint() throws Exception {
        int driverId = 4; // in real life you might pull this from a database...

        this.mvc.perform(get(String.format("/drivers/%d/trips", driverId)))
                .andExpect(status().isOk());
    }

    public void testPathVariable() throws Exception {
        String taskId = "3";

    }
}
