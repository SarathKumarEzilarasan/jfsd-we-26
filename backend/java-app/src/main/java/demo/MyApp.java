package demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyApp {

    public static void main(String[] args) {
//        CricketCoach coach = new CricketCoach(new HappyWishService());
//        CricketCoach coach = new CricketCoach();
//        coach.setWishService(new HappyWishService());
//        FootballCoach coach = new FootballCoach();
//        Coach coach = new FootballCoach();


//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("config.xml");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportsConfig.class);
//        Coach coach = context.getBean("myCricketCoach", Coach.class);
        Coach coach = context.getBean("cricketCoach", Coach.class);
        System.out.println(coach.getDailyWorkOut());
        System.out.println(coach.getDailyWish());
        System.out.println(coach.getTeam());
//        Coach coach1 = context.getBean("cricketCoach", Coach.class);

//        System.out.println(coach);
//        System.out.println(coach1);

        List arrayList = context.getBean("list", List.class);;
        System.out.println(arrayList);

        context.close();
    }
}

// singleton