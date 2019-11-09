package com.plough.random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author plough
 * @date 2019/11/9
 */
@Configuration // 开启配置
@EnableConfigurationProperties(RandomChoiceProperties.class) // 开启使用映射实体对象
@ConditionalOnClass(RandomChoiceMachine.class) // 存在HelloService时初始化该配置类
@ConditionalOnProperty // 存在对应配置信息时初始化该配置类
        (
                prefix = "demo.random.choice", // 存在配置前缀
                value = "enabled", // 开启
                matchIfMissing = true // 缺失检查
        )
public class RandomAutoConfiguration {

    /**
     * application.properties 配置文件映射前缀实体对象
     */
    @Autowired
    private RandomChoiceProperties randomChoiceProperties;

    /**
     * 根据条件判断不存在 RandomChoiceMachine 时初始化新 bean 到 Spring 容器
     */
    @Bean
    @ConditionalOnMissingBean(RandomChoiceMachine.class)
    public RandomChoiceMachine randomChoiceMachine() {
        return new RandomChoiceMachine(randomChoiceProperties.getItems(), randomChoiceProperties.getNum());
    }
}
