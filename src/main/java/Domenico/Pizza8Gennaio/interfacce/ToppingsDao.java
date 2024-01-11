package Domenico.Pizza8Gennaio.interfacce;

import Domenico.Pizza8Gennaio.enteties.Toppings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToppingsDao extends JpaRepository<Toppings,Long> {
}
