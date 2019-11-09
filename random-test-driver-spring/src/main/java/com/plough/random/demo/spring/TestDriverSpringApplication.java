package com.plough.random.demo.spring;

import com.plough.random.RandomChoiceMachine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author plough
 * @date 2019/11/9
 */
@Component
public class TestDriverSpringApplication {
    @Autowired
    private RandomChoiceMachine randomChoiceMachine;

    public void run() {
        for (int i = 0; i < 3; i++) {
            printList(randomChoiceMachine.next());
        }
    }

    private void printList(List<String> list) {
        System.out.println(String.join(",", list));
    }

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TestDriverSpringApplication testDriver = context.getBean(TestDriverSpringApplication.class);
        testDriver.run();
    }
}
