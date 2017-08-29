package ua.com.train.myapp;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.com.train.myapp.config.ModelConfig;
import ua.com.train.myapp.dao.impl.UserDaoImpl;
import ua.com.train.myapp.model.User;
import ua.com.train.myapp.services.UserService;

import java.util.List;

public class TestApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ModelConfig.class);

        UserService userService = context.getBean(UserService.class);

        User user = new User();
        user.setUserName("Jack");
        user.setUserPassword("1111");
        userService.save(user);
        System.out.println(userService.getById(1));

        System.out.println("Lol");
    }
}
