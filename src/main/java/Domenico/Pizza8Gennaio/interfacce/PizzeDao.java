package Domenico.Pizza8Gennaio.interfacce;

import Domenico.Pizza8Gennaio.enteties.Pizze;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzeDao extends JpaRepository<Pizze,Long> {

}
