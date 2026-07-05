package demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component//("myWish")
//@Primary
public class HappyWishService implements WishService{
    @Override
    public String getWish() {
        return "Good luck for the match";
    }
}
