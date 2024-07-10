package org.mediaAggregator;

import org.mediaAggregator.model.User;
import org.mediaAggregator.repository.UserRepository;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.slf4j.Logger;

@SpringBootApplication
public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    public CommandLineRunner demo(UserRepository repository) {
        return (args) -> {
            repository.save(new User("Mark", "McMahon"));
            repository.save(new User("Brian", "Matzelle"));
            repository.save(new User("Jason", "Dunn"));

            log.info("all customers:");
            log.info("-------------------");
            repository.findAll().forEach(customer -> {
                log.info(customer.toString());
            });

            User user = repository.findById(1L);
            log.info("customer found with ID:");
            log.info("-------------------");
            log.info(user.toString());

            repository.findByLastName("McMahon").forEach(userMcMahon ->
                    log.info(userMcMahon.toString())
            );

            log.info("customer found with last name:");
            log.info("-------------------");
            log.info(user.toString());

        };


    }

}
