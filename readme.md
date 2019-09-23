### Spring Ioc

本项目基于`spring 4.3.18.RELEASE` 版本
> spring 基本jar 图

`aopalliance-1.0.jar` 

`commons-logging-1.2.jar`

`spring-aop-4.3.18.RELEASE.jar` aop包

`spring-aspects-4.3.18.RELEASE.jar` 切面

`spring-beans-4.3.18.RELEASE.jar` 

`spring-context-4.3.18.RELEASE.jar`

`spring-context-support-4.3.18.RELEASE.jar`

`spring-core-4.3.18.RELEASE.jar`

`spring-expression-4.3.18.RELEASE.jar`

`spring-instrument-4.3.18.RELEASE.jar`

`spring-instrument-tomcat-4.3.18.RELEASE.jar`

`spring-jdbc-4.3.18.RELEASE.jar`

`spring-jms-4.3.18.RELEASE.jar`

`spring-messaging-4.3.18.RELEASE.jar`

`spring-orm-4.3.18.RELEASE.jar`

`spring-oxm-4.3.18.RELEASE.jar`

`spring-test-4.3.18.RELEASE.jar`

`spring-tx-4.3.18.RELEASE.jar`


简单实现了怎么使用spring ioc 的过程

```java
public class IocApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserDao userDao = applicationContext.getBean("userDao",UserDaoImpl.class);
        userDao.say();
    }
}
```
UserDao
```java
public interface UserDao {
    void say();
}
```
UserDaoImpl
```java
public class UserDaoImpl implements UserDao {
    @Override
    public void say() {
        System.out.println("hi spring ioc");
    }
}
```

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">


    <bean id="userDao" class="com.ddfoever.daoimpl.UserDaoImpl"></bean>

</beans>
```


