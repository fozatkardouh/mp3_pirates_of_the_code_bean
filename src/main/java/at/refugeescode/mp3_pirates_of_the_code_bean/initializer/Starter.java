package at.refugeescode.mp3_pirates_of_the_code_bean.initializer;

import at.refugeescode.mp3_pirates_of_the_code_bean.models.JackSparrow;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Starter {

    @Bean
    public ApplicationRunner startPoint(JackSparrow jackSparrow) {
        return args -> {
            jackSparrow.searchForTheCursedCoin();
            System.out.println(jackSparrow.getCursedCoin());
        };
    }

}
