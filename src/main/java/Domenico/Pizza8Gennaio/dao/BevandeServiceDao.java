package Domenico.Pizza8Gennaio.dao;

import Domenico.Pizza8Gennaio.enteties.Bevande;
import Domenico.Pizza8Gennaio.interfacce.BevandeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BevandeServiceDao {
    @Autowired
    BevandeDao bevandeDao;

    public void saveBevande(Bevande bevande){
        bevandeDao.save(bevande);
    }


}
