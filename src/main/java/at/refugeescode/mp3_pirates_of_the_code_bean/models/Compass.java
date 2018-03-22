package at.refugeescode.mp3_pirates_of_the_code_bean.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Compass {

    @Autowired
    private CursedCoin cursedCoin;

    public CursedCoin getCursedCoin() {
        return cursedCoin;
    }
}
