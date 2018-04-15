package study.pattern.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import study.pattern.entity.Superhero;

public interface SuperheroRepository extends JpaRepository<Superhero, Long> {
}
