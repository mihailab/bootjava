package ru.javaops.bootjava.mitriy;

import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MitriyUserRepositoryRunner implements ApplicationRunner {

    private final MitriyUserRepository mitriyUserRepository;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println(mitriyUserRepository.findUserById(1));
        System.out.println(mitriyUserRepository.findById(1));
        System.out.println(mitriyUserRepository.findAll());
    }
}
