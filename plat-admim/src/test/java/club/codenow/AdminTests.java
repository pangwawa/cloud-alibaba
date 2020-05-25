package club.codenow;


import club.codenow.controller.TestController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.http.Cookie;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminTests {
    @Autowired
    private WebApplicationContext webContext;

    private MockMvc mockMvc;

    @Before
    public void setupMockMvc() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(webContext).build();
    }

    @Test
    public void testGet() throws Exception {
        System.err.println("========================");
        Cookie cookies = new Cookie("cookie", "cook");
        mockMvc.perform(get("/test/event")
                .header("header", "hehe")
                .cookie(cookies)
                .requestAttr("name", "pangbin")
                .sessionAttr("name", "panggao")
                .characterEncoding("UTF-8"))
                .andExpect(status().isOk())
                .andDo(MockMvcResultHandlers.print(System.err))
                .andReturn();
        System.err.println("========================");
    }

//    @Test
//    public void testPost() throws Exception {
//        System.err.println("========================");
//        mockMvc.perform(post("/index")
//                .header("header", "hehe")
//                .param("body", "baby!"))
//                .andExpect(status().isOk())
//                .andDo(MockMvcResultHandlers.print(System.err))
//                .andReturn();
//        System.err.println("========================");
//    }
}

