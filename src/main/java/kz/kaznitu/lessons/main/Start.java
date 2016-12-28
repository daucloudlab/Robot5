package kz.kaznitu.lessons.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml") ;

//        Robot robot = (Robot)context.getBean("robot1") ;
//        robot.action();

//        T1000 t1000 = (T1000)context.getBean("robot2") ;
//        t1000.action();

        T1000 t1000 = (T1000)context.getBean("robot3") ;
        t1000.action();
    }
}
