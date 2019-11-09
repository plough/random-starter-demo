# 模块简介
#### 1 random
我们想要复用的独立功能模块，简单起见，只包含了一个工具类：RandomChoiceMachine。
#### 2 random-test-driver-spring
演示：在 Spring 项目中，使用 RandomChoiceMachine 的方式。
#### 3 spring-boot-starter-random
包装了 random 模块的自定义 starter。它展示了怎样写一个自定义 Starter。
#### 4 random-test-driver-spring
演示：在 SpringBoot 项目中，借助自定义 Starter，使用 RandomChoiceMachine 的方式。

## 总结
通过 2 和 4 的对比，可以看出 SpringBoot 自动配置功能的威力。
只要依赖一个 Starter，不写 Java 配置类，配置文件里的属性就能自动生效。