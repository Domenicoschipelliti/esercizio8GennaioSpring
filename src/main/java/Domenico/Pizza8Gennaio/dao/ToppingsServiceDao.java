package Domenico.Pizza8Gennaio.dao;

import Domenico.Pizza8Gennaio.enteties.Toppings;
import Domenico.Pizza8Gennaio.interfacce.ToppingsDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ToppingsServiceDao {
    @Autowired
    ToppingsDao toppingsDao;

    public void saveToppings(Toppings toppings){
        toppingsDao.save(toppings);
        log.info("condimento aggiunto");

    }
}
