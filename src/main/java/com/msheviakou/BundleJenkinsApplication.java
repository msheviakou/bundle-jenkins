package com.msheviakou;

import com.msheviakou.user.User;
import com.msheviakou.user.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BundleJenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BundleJenkinsApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(UserRepository userRepository) {
        return (args) -> {
            userRepository.save(new User("msheviakou"));
            userRepository.save(new User("shevyakovmmbsuir"));
        };
    }
}
