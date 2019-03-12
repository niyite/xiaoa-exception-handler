# xiaoa-exception-handler
通用异常处理办法

通过AOP的思想，拦截Controller中的异常，统一用拦截器处理异常，处理方法在common.advice.CommonExceptionHandler中,
通过枚举类定义异常,使代码异常优雅

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

# 友情援助  
(您的支持,是我前进的动力,一分也是爱,有任何疑问请联系QQ:747431644)  
![image](https://github.com/niyite/image/blob/master/1552375153915.jpg)