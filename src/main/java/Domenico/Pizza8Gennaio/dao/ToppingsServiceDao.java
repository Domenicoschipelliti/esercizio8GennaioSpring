package Domenico.Pizza8Gennaio.dao;

import Domenico.Pizza8Gennaio.enteties.Toppings;
import Domenico.Pizza8Gennaio.interfacce.ToppingsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToppingsServiceDao {
    @Autowired
    ToppingsDao toppingsDao;

    public void saveToppings(Toppings toppings){
        toppingsDao.save(toppings);

    }
}
