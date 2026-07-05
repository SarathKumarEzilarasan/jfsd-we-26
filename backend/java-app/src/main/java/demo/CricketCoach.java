package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component//("myCricketCoach")
//@Scope(scopeName = "prototype")
public class CricketCoach implements Coach {

    //    @Autowired
    private WishService wishService;
    //    @Value("India")
    @Value("${sports.team}")
    private String team;

//    @Autowired
//    public CricketCoach(@Qualifier("happyWishService") WishService wishService) {
//        this.wishService = wishService;
//    }

    @Autowired
    @Qualifier("happyWishService")
    public void setWishService(WishService wishService) {
        this.wishService = wishService;
    }

    public String getDailyWorkOut() {
        return "Spend 30 mins batting practice";
    }

    @Override
    public String getDailyWish() {
        return wishService.getWish();
    }

    public WishService getWishService() {
        return wishService;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @PostConstruct
    public void startUpMethod() {
        System.out.println("started");
    }

    @PreDestroy
    public void destroyMethod() {
        System.out.println("destroyed");
    }
}
