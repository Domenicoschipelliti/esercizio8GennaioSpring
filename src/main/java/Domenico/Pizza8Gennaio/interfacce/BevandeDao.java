package Domenico.Pizza8Gennaio.interfacce;

import Domenico.Pizza8Gennaio.enteties.Bevande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BevandeDao extends JpaRepository<Bevande,Long> {
}
