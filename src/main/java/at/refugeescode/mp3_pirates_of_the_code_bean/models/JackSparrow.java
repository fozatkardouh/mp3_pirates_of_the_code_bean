package at.refugeescode.mp3_pirates_of_the_code_bean.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JackSparrow {

    @Autowired
    private Compass compass;
    private CursedCoin cursedCoin = null;

    public void searchForTheCursedCoin() {
        cursedCoin = getCursedCoinFromCompass();
    }

    private CursedCoin getCursedCoinFromCompass() {
        return compass.getCursedCoin();
    }

    public String getCursedCoin() {
        if (cursedCoin == null) {
            return "Cursed Coin not found!";
        }
        return "Cursed Coin found!";
    }

}