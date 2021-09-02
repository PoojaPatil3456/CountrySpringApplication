package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
            int choice=0;
            System.out.println("1.Maharashtra\n2.Gujrat\n3.TamilNadu\n4.exit");
            System.out.println("Enter your choice:");
            Scanner scan = new Scanner(System.in);
            choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
                    India s2 = (India) context.getBean("country");
                    s2.show();
                    Maharashtra mh = (Maharashtra) context.getBean("mh");
                    mh.display();
                    Specialities specialities = (Specialities) context.getBean("specialities");
                    specialities.getTrophies();
                    specialities.getWonders();
                    specialities.getPopulationOfStates();
                    specialities.getFamousFoodOfStates();
                    break;
                case 2:
                    ApplicationContext factory = new AnnotationConfigApplicationContext(USAConfig.class);
                    USA obj = factory.getBean(USA.class);
                    obj.printMessage();
                    /*ApplicationContext factory1 = new AnnotationConfigApplicationContext(GujaratConfig.class);
                    Gujarat obj1 = factory1.getBean(Gujarat.class);
                    obj1.printMessage();*/
                    break;
                default:
                    System.out.println("Thank You for visiting");
            }
    }
}
