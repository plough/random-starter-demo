package com.plough.random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

/**
 * @author plough
 * @date 2019/11/9
 */
@SpringBootApplication
public class TestDriverSpringBootApplication implements CommandLineRunner {
    @Autowired
    private RandomChoiceMachine randomChoiceMachine;

    public static void main(String[] args) {
        SpringApplication.run(TestDriverSpringBootApplication.class);
    }

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 3; i++) {
            printList(randomChoiceMachine.next());
        }
    }

    private void printList(List<String> list) {
        System.out.println(String.join(",", list));
    }
}
