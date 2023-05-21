package com.example.masterjavastreamapi.faker;

import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleDataLoader implements CommandLineRunner {
    private final Faker faker;

    public SampleDataLoader() {
        this.faker = new Faker();
    }

    @Override
    public void run(String... args) throws Exception {

    }
}