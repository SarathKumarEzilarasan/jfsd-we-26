package demo;

import org.springframework.stereotype.Component;

@Component//("myWish")
public class MotivateWishService implements WishService{
    @Override
    public String getWish() {
        return "Do Well !!!!!!";
    }
}
