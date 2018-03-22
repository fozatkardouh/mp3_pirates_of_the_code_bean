package at.refugeescode.mp3_pirates_of_the_code_bean.models;

import org.springframework.stereotype.Component;

@Component
public class JackSparrow {

    private Compass compass;
    private CursedCoin cursedCoin;

    public JackSparrow(Compass compass) {
        this.compass = compass;
    }

    public String searchForTheCursedCoin() {
        cursedCoin = getCursedCoinFromCompass();
        if (cursedCoin == null) {
            return "Cursed Coin not found!";
        }
        return "Cursed Coin found!";
    }

    private CursedCoin getCursedCoinFromCompass() {
        return compass.getCursedCoin();
    }

}