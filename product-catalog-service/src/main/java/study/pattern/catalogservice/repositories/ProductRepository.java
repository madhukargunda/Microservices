package study.pattern.catalogservice.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import study.pattern.catalogservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByCode(String code);
}
