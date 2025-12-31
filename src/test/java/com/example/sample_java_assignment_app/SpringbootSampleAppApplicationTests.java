package com.example.sample_java_assignment_app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringbootSampleAppApplicationTests {

    @Test
    void testLogin() {
        SpringbootSampleAppApplication obj=new SpringbootSampleAppApplication();
        String res=obj.login("Name");
        assertEquals("Please input your credentials for login...",res);
    }

    @Test
    void testRegister() {
        SpringbootSampleAppApplication obj=new SpringbootSampleAppApplication();
        String res=obj.register("Name");
        assertEquals("Please follow registration process...",res);
    }

    @Test
    void mainTest(){
        SpringbootSampleAppApplication.main(new String[] {});
    }
}