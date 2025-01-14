package me.somoncef.inventoryservice;

import me.somoncef.inventoryservice.entities.Product;
import me.somoncef.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.rmi.server.UID;
import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return args -> {
          productRepository.save(Product.builder().id("P01").name("Computer").price(2511).quantity(5).build());
          productRepository.save(Product.builder().id("P02").name("Printer").price(2532).quantity(52).build());
          productRepository.save(Product.builder().id("P03").name("Mouse").price(8968).quantity(98).build());
        };
    }
}
