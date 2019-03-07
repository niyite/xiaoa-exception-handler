# xiaoa-exception-handler
通用异常处理办法

通过AOP的思想，拦截Controller中的异常，统一用拦截器处理异常，处理方法在common.advice.CommonExceptionHandler中

# 依赖
<dependencies>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <version>1.16.22</version>
    </dependency>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-webmvc</artifactId>
        <version>5.0.8.RELEASE</version>
    </dependency>
</dependencies>