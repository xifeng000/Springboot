package Commonconfig;

import country.Country;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Commonconfig {
    @Bean
    public Country country(){
        return new Country();
    }
}
