package rws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class ExampleApp {


    public static void main(String[] args) {
        SpringApplication.run(ExampleApp.class,args);
    }

    @Bean
    @Primary
    @Autowired

    public Greeter multiGreeter(final EnglishGreeter englishGreeter, final DutchGreeter dutchGreeter){
        return () -> { return englishGreeter.greet() + "\n" + dutchGreeter.greet(); };
    }



}
