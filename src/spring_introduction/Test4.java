package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {

        // Singleton;
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog myDog = context.getBean("myPetSingleton", Dog.class);
        myDog.setName("Belka");
        Dog yourDog = context.getBean("myPetSingleton", Dog.class);
        yourDog.setName("Strelka");

        System.out.println(myDog.getName());
        System.out.println(yourDog.getName());

        System.out.println("Переменные ссылаются на один и тот-же объект? " + (myDog == yourDog));
        System.out.println(myDog);
        System.out.println(yourDog);
        System.out.println("---------------------------------");

        // Singleton;
        Dog myDog2 = context.getBean("myPetPrototype", Dog.class);
        myDog2.setName("Bim");
        Dog yourDog2 = context.getBean("myPetPrototype", Dog.class);
        yourDog2.setName("Bom");

        System.out.println(myDog2.getName());
        System.out.println(yourDog2.getName());

        System.out.println("Переменные ссылаются на один и тот-же объект? " + (myDog2 == yourDog2));
        System.out.println(myDog2);
        System.out.println(yourDog2);
    }
}
