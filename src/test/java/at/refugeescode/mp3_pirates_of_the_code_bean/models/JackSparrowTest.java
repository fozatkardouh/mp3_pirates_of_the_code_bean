package at.refugeescode.mp3_pirates_of_the_code_bean.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class JackSparrowTest {

    @Autowired
    private JackSparrow jackSparrow;

    @Test
    void searchForTheCursedCoin() {
        String result = jackSparrow.searchForTheCursedCoin();
        Assertions.assertEquals("Cursed Coin found!", result);
    }

}