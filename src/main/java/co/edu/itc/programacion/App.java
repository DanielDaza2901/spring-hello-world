package co.edu.itc.programacion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SaludoService saludo = context.getBean(SaludoService.class);
        System.out.println(saludo.obtenerSaludo());
    }
}
