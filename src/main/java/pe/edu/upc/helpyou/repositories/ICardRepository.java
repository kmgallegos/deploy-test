package pe.edu.upc.helpyou.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.helpyou.entities.Card;

public interface ICardRepository extends JpaRepository<Card, Integer> {
}
