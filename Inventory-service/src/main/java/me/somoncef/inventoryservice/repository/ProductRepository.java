package me.somoncef.inventoryservice.repository;

import me.somoncef.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ProductRepository extends JpaRepository<Product,String> {

}
