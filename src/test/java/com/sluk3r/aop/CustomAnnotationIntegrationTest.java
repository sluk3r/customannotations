package com.sluk3r.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@SpringBootTest(classes = Application.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class CustomAnnotationIntegrationTest {

    @Autowired
    private Service service;

    @Test
    public void shouldApplyCustomAnnotation() throws InterruptedException {
        service.serve();
    }

}
