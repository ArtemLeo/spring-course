package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        // Pet pet = new Dog();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //  Pet pet = context.getBean("myPet", Pet.class);

        Person person1 = context.getBean("myPersonConst", Person.class);
        person1.callYourPet();

        Person person2 = context.getBean("myPersonSet", Person.class);
        person2.callYourPet();
        System.out.println(person2.getSurname());
        System.out.println(person2.getAge());

        context.close();
    }
}
