package redhood.com.demo1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import redhood.com.demo1.web.HelloController;

@SpringBootTest
class Demo1ApplicationTests {
    @Autowired
   HelloController helloController;
   static MockMvc mockMvc;

    @BeforeEach
   public  void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(helloController).build();
        System.out.println("sb");
    }

    @Test
   public void contextLoads() {

    }

    @Test
    void testHello() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/rest/hello")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

}
