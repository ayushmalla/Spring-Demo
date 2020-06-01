/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 *
 * @author pc
 */
public class Launch {
    public static void main(String[]args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        Car c = (Car) context.getBean("myCar", Car.class);
        
        System.out.println(c.start());
        
        System.out.println(c.features());
    }
}
