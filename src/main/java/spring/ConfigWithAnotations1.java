package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Cat myCat = context.getBean("CatBean", Cat.class);
        myCat.say();
        context.close();
    }
}
