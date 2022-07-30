package com.jeonghyeon.study.web;

import com.jeonghyeon.study.web.config.auth.SecurityConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matcher.*;


@WebMvcTest(controllers = HelloController.class,
excludeFilters = {
        @ComponentScan.Filter(type= FilterType.ASSIGNABLE_TYPE,
        classes = SecurityConfig.class)
})
public class HelloControllerTest {

  /* 테스트 나중에 다시 시도 예정

    @Autowired
    private MockMvc mvc;

    @Test
    @WithMockUser(roles = "USER")
    public void hello_리턴되다() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
    }
    @Test
    @WithMockUser(roles = "USER")
    public void helloDto가_리턴된다() throws Exception{
        String name="hello";
        int amount = 1000;
        mvc.perform(get("/hello/dto")
                    .param("name",name)
                    .param("amount",String.valueOf(amount))
                    )
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value(name))
                .andExpect(jsonPath("$.amount").value(amount));

    }*/
}
