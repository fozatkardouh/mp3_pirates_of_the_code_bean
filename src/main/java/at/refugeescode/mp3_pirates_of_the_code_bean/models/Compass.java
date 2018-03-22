package at.refugeescode.mp3_pirates_of_the_code_bean.models;

import org.springframework.stereotype.Component;

@Component
public class Compass {

    private CursedCoin cursedCoin;

    public Compass(CursedCoin cursedCoin) {
        this.cursedCoin = cursedCoin;
    }

    public CursedCoin getCursedCoin() {
        return cursedCoin;
    }

}
