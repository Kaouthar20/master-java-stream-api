package com.example.masterjavastreamapi;

import com.example.masterjavastreamapi.models.Product;
import com.example.masterjavastreamapi.repositories.ProductRepository;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class MasterJavaStreamApiApplication implements CommandLineRunner {
    private final ProductRepository productRepository;

    public MasterJavaStreamApiApplication(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(MasterJavaStreamApiApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Faker faker = new Faker();

        for (int i = 0; i < 10; i++) {
            System.out.println(faker);
            Product product = new Product();
            product.setName(faker.name().title());
            product.setCategory(i % 2 == 0 ? "Books" : faker.name().title());
            product.setPrice(faker.number().numberBetween(10, 1000));
        }

        List<Product> products = productRepository.findAll();

        List<Product> list = products
                .stream()
                .filter(product -> product.getCategory().equalsIgnoreCase("Books"))
                .filter(product -> product.getPrice() >= 500)
                .toList();

        System.out.println(list);
    }
}
