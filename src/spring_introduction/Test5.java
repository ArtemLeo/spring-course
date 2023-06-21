package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog myDog = context.getBean("myPetSingleton", Dog.class);
        myDog.say();
        System.out.println("----------------------------------------");

        Pet myDog2 = context.getBean("myPetPrototype", Dog.class);
        myDog2.say();
        context.close();
    }
}
