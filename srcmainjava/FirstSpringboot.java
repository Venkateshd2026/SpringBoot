package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringProject1Application {

    public static void main(String[] args) {

        ApplicationContext ref =
                SpringApplication.run(FirstSpringProject1Application.class, args);

        Student st = ref.getBean(Student.class);

        st.study();
        st.check();

        Laptop lap = ref.getBean(Laptop.class);
        lap.work();
    }
}
